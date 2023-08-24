package com.example.magangstechoq;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        View btnRegister = findViewById(R.id.btnRegister_reg);
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pindah ke halaman login
                startActivity(new Intent(RegisterActivity.this, LoginActivity.class));
            }
        });

        ImageView profileImage = findViewById(R.id.homeButton);
        profileImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pindah kembali ke MainActivity
                Intent intent = new Intent(RegisterActivity.this, MainActivity.class);
                startActivity(intent);
                finish(); // Menutup RegisterActivity agar tidak dapat kembali dengan tombol back
            }
        });

    }
}