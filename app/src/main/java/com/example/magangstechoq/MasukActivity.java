package com.example.magangstechoq;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MasukActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_masuk);

        View btnRegister = findViewById(R.id.loginButton);
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pindah ke halaman registrasi
//                startActivity(new Intent(MasukActivity.this, DaftarActivity.class));
            }
        });

        View btnLogin = findViewById(R.id.loginButton);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pindah ke halaman registrasi
                startActivity(new Intent(MasukActivity.this, DataActivity.class));
            }
        });

        ImageView profileImage = findViewById(R.id.homeButton);
        profileImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pindah kembali ke MainActivity
                Intent intent = new Intent(MasukActivity.this, MainActivity.class);
                startActivity(intent);
                finish(); // Menutup RegisterActivity agar tidak dapat kembali dengan tombol back
            }
        });
    }
}