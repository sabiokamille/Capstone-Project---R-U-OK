package com.example.ruokapp.Service;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.ruokapp.Common.Common;
import com.example.ruokapp.Model.User;
import com.example.ruokapp.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class HomeActivity extends AppCompatActivity {

    CollectionReference userRef;
    FirebaseAuth mAuth;
    BottomSheetDialog bottomSheetDialog;

    @BindView(R.id.layout_user_information)
    LinearLayout layout_user_information;

    @OnClick(R.id.card_view_booking)
    void booking()
    {
        startActivity(new Intent(getApplicationContext(), BookingActivity.class));
    }



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ButterKnife.bind(HomeActivity.this);

        //Init
        userRef = FirebaseFirestore.getInstance().collection("User");
        // Check if user is signed in (non-null) and update UI accordingly.
        mAuth = FirebaseAuth.getInstance();
        FirebaseUser currentUser = mAuth.getCurrentUser();
        if(currentUser != null) {

            DocumentReference currUser = userRef.document(currentUser.getEmail().toString());
            currUser.get()
                    .addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
                        @Override
                        public void onComplete(@NonNull Task<DocumentSnapshot> task) {

                            if(task.isSuccessful())
                            {
                                DocumentSnapshot userSnapShot = task.getResult();
                                if(!userSnapShot.exists())
                                {
                                    showUpdateDialog(currentUser.getEmail().toString());
                                }
                                else
                                {
                                    Common.cntUser = userSnapShot.toObject(User.class);
                                }
                            }

                        }
                    });
            /**I HAVE INSTEAD PUT SET USER INFORMATION IN HERE */
            //setUserInformation();
        }

    }

    /**private void setUserInformation() {
        layout_user_information.setVisibility(View.VISIBLE);
        txt_user_name.setText(Common.cntUser.getName());
    }*/

    private void showUpdateDialog(String email) {

        //Init dialog
        bottomSheetDialog = new BottomSheetDialog(this);
        bottomSheetDialog.setCanceledOnTouchOutside(false);
        bottomSheetDialog.setCancelable(false);
        View sheetView = getLayoutInflater().inflate(R.layout.layout_update_information,null);

        Button btn_update = (Button)sheetView.findViewById(R.id.btn_update);
        EditText edit_name = (EditText)sheetView.findViewById(R.id.edit_name);
        EditText edit_studentID = (EditText)sheetView.findViewById(R.id.edit_studentID);

        btn_update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                User user = new User(edit_name.getText().toString(),
                        edit_studentID.getText().toString(),email);
                userRef.document(email)
                        .set(user)
                        .addOnSuccessListener(new OnSuccessListener<Void>() {
                            @Override
                            public void onSuccess(Void unused) {
                                bottomSheetDialog.dismiss();

                                //Common.cntUser = user;

                                Toast.makeText(HomeActivity.this, "Thank You", Toast.LENGTH_SHORT).show();
                            }
                        }).addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                bottomSheetDialog.dismiss();
                                Toast.makeText(HomeActivity.this, ""+e.getMessage(), Toast.LENGTH_SHORT).show();
                            }
                        });
            }
        });

        bottomSheetDialog.setContentView(sheetView);
        bottomSheetDialog.show();



    }
}
