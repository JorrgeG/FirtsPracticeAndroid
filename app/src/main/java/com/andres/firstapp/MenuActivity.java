package com.andres.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    Button btnFruits, btnColors, btnAnimals;

    ButtonOnClick _buttonOnClick;

    public MenuActivity(){
        _buttonOnClick = new ButtonOnClick();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btnAnimals = findViewById(R.id.btnMenuAnimals);
        btnColors = findViewById(R.id.btnMenuColors);
        btnFruits = findViewById(R.id.btnMenuFruits);


        _buttonOnClick.ClickIntent(btnAnimals, MenuActivity.this, AnimalsActivity.class);
        _buttonOnClick.ClickIntent(btnColors, MenuActivity.this, ColorsActivity.class);
        _buttonOnClick.ClickIntent(btnFruits, MenuActivity.this, FruitActivity.class);

        //this._iBtn.Click(btnAnimals, MenuActivity.this, AnimalsActivity.class);

    }
}