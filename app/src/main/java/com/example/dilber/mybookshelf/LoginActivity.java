package com.example.dilber.mybookshelf;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;


import okhttp3.Credentials;



public class LoginActivity extends AppCompatActivity {

    Button login,register;
    EditText mail,etxtpassword;
    private String username,password;

    private FirebaseAuth mAuth;
    TextView warn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_login);
        login =findViewById(R.id.btnlogin);
        register = findViewById(R.id.btnregister);
        mail = findViewById(R.id.mail);
        etxtpassword = findViewById(R.id.Password);
        warn = findViewById(R.id.txt_warn);

        mAuth = FirebaseAuth.getInstance();
        FirebaseUser currentUser = mAuth.getCurrentUser();

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                username = mail.getText().toString();
                password = etxtpassword.getText().toString();


                mAuth.signInWithEmailAndPassword(username,password).addOnCompleteListener(LoginActivity.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {

                            Intent intent = new Intent(LoginActivity.this,MainActivity.class);
                            startActivity(intent);

                        }
                        else {
                            Log.e("Giriş Hatası",task.getException().getMessage());
                            warn.setText("Invalid username or password");
                        }
                    }
                });


            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(i);
            }
        });

    }

}
