package com.example.books;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class psychologyofmoneyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_psychologyofmoney);
        goBrowseBooks();
        goRequestBooks();
        
    }

    private void goRequestBooks(){
        Button button = (Button) findViewById(R.id.RequestBook);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(psychologyofmoneyActivity.this, RequestActivity.class));
            }
        });
    }

    private void goBrowseBooks(){
        Button button = (Button) findViewById(R.id.backButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(psychologyofmoneyActivity.this, BrowseBooksActivity.class));
            }
        });
    }
}