package com.example.test.weightapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //extend merupakan inheritance
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //method onclick, View view sebagai paramater
   public void tentang(View view) {
       Intent intent = new Intent(MainActivity.this,tentang.class);
       startActivity(intent);
   }

    public void hitung(View view) {
        Intent intent = new Intent(MainActivity.this,HitungActivity.class);
        startActivity(intent);
    }
}
