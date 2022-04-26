package com.albeeak.a10119203latihan2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;

import android.os.Bundle;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void Pindah(View view) {
        Intent intent = new Intent(RegisterActivity.this, AlmostActivity.class);
        startActivity(intent);
    }
}