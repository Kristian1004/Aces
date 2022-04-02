package com.example.minilibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MarcoPoloActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marco_polo);

        goBack();
        goRequest();
    }

    private void goBack(){
        Button button = (Button) findViewById(R.id.backButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MarcoPoloActivity.this, BrowseBooksActivity.class));
            }
        });
    }


    private void goRequest(){
        Button button = (Button) findViewById(R.id.RequestBook);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MarcoPoloActivity.this, RequestActivity.class));
            }
        });
    }
}