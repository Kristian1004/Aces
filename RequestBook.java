package com.example.resultbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RequestBook extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.RequestBook);
    }

    public void goNextPage(View view) {
        startActivity(new Intent(RequestBook.this, MenuscreenActivity.class));
    }


}