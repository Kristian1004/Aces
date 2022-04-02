package com.example.books;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;;

public class browsebooksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.browsebooksActivity);
        goBrowseBooks();
        goRequestBooks();

    }

    private void goRequestBooks(){
        Button button = (Button) findViewById(R.id.RequestBook);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(browsebooksActivity.this, RequestActivity.class));
            }
        });
    }

    private void goBrowseBooks(){
        ImageButton button = (ImageButton) findViewById(R.id.imageButton9);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(browsebooksActivity.this, WimpyKidActivity.class));
            }
        });
    }
}
