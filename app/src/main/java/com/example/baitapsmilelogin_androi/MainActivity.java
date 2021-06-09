package com.example.baitapsmilelogin_androi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button btnSignIn,btnRegister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSignIn=findViewById(R.id.btnDN);
        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnSignIn = findViewById(R.id.btnDN);
                btnSignIn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(com.example.baitapsmilelogin_androi.MainActivity.this,Sign.class));
                    }
                });
            }
        });

        btnRegister = findViewById(R.id.btnDK);
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(com.example.baitapsmilelogin_androi.MainActivity.this, Dangky.class));
            }
        });
    }


}