package com.andres.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnsiguiente;  // DECLARACINO DE VARIABLE DE TIPO BUTTON

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnsiguiente = findViewById(R.id.btnNext);
        btnsiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MenuActivity.class);
                startActivity(intent);
            }
        });
    }

    public void nextButton(View view) {
    }
}