package com.example.minilibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        goMenuScreen();
        goBrowseBooks();

    }

    private void goMenuScreen(){
        Button button = (Button) findViewById(R.id.MenuButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, MenuscreenActivity.class));
            }
        });
    }
    private void goBrowseBooks(){
        Button button = (Button) findViewById(R.id.browseBooksButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, BrowseBooksActivity.class));
            }
        });
    }


}
