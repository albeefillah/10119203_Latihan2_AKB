package com.albeeak.a10119203latihan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
// Nama : Albee Akbar Fillah
// Kelas : IF-5
// Tgl Pengerjaan : 25 April 2022
public class AlmostActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_almost);
    }

    public void Pindah(View view) {
        Intent intent = new Intent(AlmostActivity.this, VerifyActivity.class);
        startActivity(intent);
    }
}