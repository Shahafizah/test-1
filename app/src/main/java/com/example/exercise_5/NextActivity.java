package com.example.exercise_5;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.annotation.SuppressLint;
import androidx.appcompat.app.AppCompatActivity;

public class NextActivity extends AppCompatActivity {
    Button button;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NextActivity.this,
                        MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
