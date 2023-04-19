package com.example.notes;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.Timestamp;
import com.google.firebase.firestore.DocumentReference;

public class NoteDetails extends AppCompatActivity {

    EditText titleEditText,contentEditText;
    ImageButton saveNoteButton;
    TextView pageTitleTextView;
    String title,content,docID;
    boolean isEditMode = false;
    TextView deleteButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_details);

        titleEditText=findViewById(R.id.note_title_text);
        contentEditText=findViewById(R.id.note_content_text);
        saveNoteButton=findViewById(R.id.save_note_button);
        pageTitleTextView=findViewById(R.id.page_title);
        deleteButton=findViewById(R.id.delete_note);

        title=getIntent().getStringExtra("title");
        content=getIntent().getStringExtra("content");
        docID=getIntent().getStringExtra("docID");

        if(docID!=null && !docID.isEmpty()){
            isEditMode=true;
        }

        titleEditText.setText(title);
        contentEditText.setText(content);

        if(isEditMode){
            pageTitleTextView.setText("Edit your note");
            deleteButton.setVisibility(View.VISIBLE);
        }

        saveNoteButton.setOnClickListener((v)-> saveNote());

        deleteButton.setOnClickListener((v)->deleteNote());

    }

    void saveNote(){
        String noteTitle = titleEditText.getText().toString();
        String noteContent= contentEditText.getText().toString();
        if(noteTitle==null || noteTitle.isEmpty()){
            titleEditText.setError("Title is required");
            return;
        }

        Note note= new Note();
        note.setTitle(noteTitle);
        note.setContent(noteContent);
        note.setTimestamp(Timestamp.now());

        saveNoteToFirebase(note);
    }

    void saveNoteToFirebase(Note note){
        DocumentReference documentReference;
        if(isEditMode){
            documentReference=Utility.getCollectionReferenceForNotes().document(docID);
        }else {
            documentReference = Utility.getCollectionReferenceForNotes().document();
        }

        documentReference.set(note).addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                if(task.isSuccessful()){
                    Utility.showToast(NoteDetails.this,"Note added successfully");
                    finish();
                } else{
                    Utility.showToast(NoteDetails.this,"Failed while adding note");
                }
            }
        });
    }

    void deleteNote(){
        DocumentReference documentReference;
            documentReference=Utility.getCollectionReferenceForNotes().document(docID);
        documentReference.delete().addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                if(task.isSuccessful()){
                    Utility.showToast(NoteDetails.this,"Note deleted successfully");
                    finish();
                } else{
                    Utility.showToast(NoteDetails.this,"Failed while deleting note");
                }
            }
        });
    }

}