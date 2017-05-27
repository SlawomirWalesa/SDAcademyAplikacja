package com.example.slawek.sdacademyaplikacja;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthException;

import butterknife.BindView;

public class RegisterActivity extends AppCompatActivity {


    @BindView(R.id.editTextEmail)
    EditText etMail;

    @BindView(R.id.editTextPassword)
    EditText etPassword;

    FirebaseAuth firebaseAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
    }

    private void registerUser(){


        String email = etMail.getText().toString().trim().toLowerCase();
        String password = etPassword.getText().toString().trim();

        firebaseAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener()

    }
}
