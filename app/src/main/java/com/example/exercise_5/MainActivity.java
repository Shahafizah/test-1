package com.example.exercise_5;

import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,NextActivity.class);
                startActivity(intent);
            }
        });
    }
}
