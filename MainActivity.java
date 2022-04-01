package com.example.minilibrary;

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
    public void goNextPage(View view) {
        startActivity(new Intent(MainActivity.this, MenuscreenActivity.class));
    }
    public void goBB(View view) {
        startActivity(new Intent(MainActivity.this, browsebooks.class));
    }

}