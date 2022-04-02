package com.example.minilibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MenuscreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menuscreen);

        goContactScreen();
        goBackBooks();
        goRequestBooks();
    }

    private void goContactScreen(){
        Button button = (Button) findViewById(R.id.ContactButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MenuscreenActivity.this, ContactActivity.class));
            }
        });
    }

    private void goBackBooks(){
        Button button = (Button) findViewById(R.id.BackButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MenuscreenActivity.this, BrowseBooksActivity.class));
            }
        });
    }


    private void goRequestBooks(){
        Button button = (Button) findViewById(R.id.RequestButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MenuscreenActivity.this, RequestActivity.class));
            }
        });
    }

    private void goMainMenu(){
        Button button = (Button) findViewById(R.id.RequestButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MenuscreenActivity.this, MainActivity.class));
            }
        });
    }
    
}
