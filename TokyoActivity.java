package com.example.minilibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class TokyoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tokyo);

        goBack();
        goRequest();
    }

    private void goBack(){
        Button button = (Button) findViewById(R.id.backButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(TokyoActivity.this, BrowseBooksActivity.class));
            }
        });
    }

    private void goRequest(){
        Button button = (Button) findViewById(R.id. RequestBook);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(TokyoActivity.this, RequestActivity.class));
            }
        });
    }
}