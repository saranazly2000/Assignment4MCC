package com.example.mccassignment4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void video1(View v) {
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        startActivity(intent);
    }
    public void video2(View v) {
        Intent intent = new Intent(MainActivity.this, MainActivity3.class);
        startActivity(intent);
    }
    public void video3(View v) {
        Intent intent = new Intent(MainActivity.this, MainActivity4.class);
        startActivity(intent);
    }
    public void video4(View v) {
        Intent intent = new Intent(MainActivity.this, MainActivity5.class);
        startActivity(intent);
    }

}