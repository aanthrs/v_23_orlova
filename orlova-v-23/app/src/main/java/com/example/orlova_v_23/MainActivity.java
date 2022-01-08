package com.example.orlova_v_23;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button imageButton = findViewById(R.id.button);
        imageButton.setOnClickListener(this);
    }

    public void onClick(View view) {
        Intent i;
        i = new Intent(MainActivity.this, MainActivity2.class);
        startActivity(i);
    }
}