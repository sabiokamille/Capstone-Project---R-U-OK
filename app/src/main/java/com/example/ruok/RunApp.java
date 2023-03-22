package com.example.ruok;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

//import com.example.caps2.R;


public class RunApp extends AppCompatActivity {
    EditText username;
    EditText password;
    Button loginButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginButton = findViewById(R.id.login);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);


    }
}