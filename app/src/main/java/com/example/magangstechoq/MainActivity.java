package com.example.magangstechoq;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnNo1 = findViewById(R.id.btnNo1);
        Button btnNo2 = findViewById(R.id.btnNo2);
        Button btnNo3 = findViewById(R.id.btnNo3);

        btnNo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Tambahkan kode untuk mengarahkan ke halaman login
                startActivity(new Intent(MainActivity.this, DaftarActivity.class));
            }
        });

        btnNo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Tambahkan kode untuk mengarahkan ke halaman registrasi
                startActivity(new Intent(MainActivity.this, RegisterActivity.class));
            }
        });

        btnNo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, DataActivity.class));
            }
        });

    }
}