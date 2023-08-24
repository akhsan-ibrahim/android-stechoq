package com.example.magangstechoq;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        View btnRegister = findViewById(R.id.btnRegister_log);
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pindah ke halaman registrasi
                startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
            }
        });

        View btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pindah ke halaman registrasi
                startActivity(new Intent(LoginActivity.this, DataActivity.class));
            }
        });

        ImageView profileImage = findViewById(R.id.homeButton);
        profileImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pindah kembali ke MainActivity
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
                finish(); // Menutup RegisterActivity agar tidak dapat kembali dengan tombol back
            }
        });

    }
}