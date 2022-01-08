package com.example.orlova_v_23;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button imageButton2 = findViewById(R.id.button);
        imageButton2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {


        Intent intent;
        switch (v.getId()) {
            case R.id.button:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://developer.android.com"));
                startActivity(intent);
        }
    }
}