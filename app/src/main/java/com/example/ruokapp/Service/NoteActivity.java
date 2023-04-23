package com.example.ruokapp.Service;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;


import com.example.ruokapp.Extra.Note;
import com.example.ruokapp.Extra.NoteAdapter;
import com.example.ruokapp.Extra.NoteDetails;
import com.example.ruokapp.Extra.Utility;
import com.example.ruokapp.R;
import com.firebase.ui.firestore.FirestoreRecyclerOptions;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.firestore.Query;

public class NoteActivity extends AppCompatActivity {

    FloatingActionButton addNoteButton;
    RecyclerView recyclerView;
    //ImageButton menuButton;

    NoteAdapter noteAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note);

        addNoteButton = findViewById(R.id.add_note_button);
        recyclerView = findViewById(R.id.recycler_view);
        //menuButton = findViewById(R.id.menu_button);

        addNoteButton.setOnClickListener((v)-> startActivity(new Intent(NoteActivity.this, NoteDetails.class)));
        // menuButton.setOnClickListener((v)->showMenu());
        setupRecyclerView();

    }

    /**void showMenu(){

     }*/

    void setupRecyclerView(){
        Query query = Utility.getCollectionReferenceForNotes().orderBy("timestamp", Query.Direction.DESCENDING);
        FirestoreRecyclerOptions<Note> options= new FirestoreRecyclerOptions.Builder<Note>().setQuery(query,Note.class).build();
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        noteAdapter = new NoteAdapter(options,this);
        recyclerView.setAdapter(noteAdapter);



    }


    @Override
    protected void onStart(){
        super.onStart();


        noteAdapter.startListening();
        //noteAdapter.startListening();
    }

    @Override
    protected void onStop(){
        super.onStop();


        noteAdapter.stopListening();
        //noteAdapter.stopListening();
    }

    @Override
    protected void onResume(){
        super.onResume();


        noteAdapter.notifyDataSetChanged();
        //noteAdapter.notifyDataSetChanged();
    }
}
