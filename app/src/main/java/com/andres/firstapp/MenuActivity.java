package com.andres.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity implements IButtonOnClick {

    Button btnFruits, btnColors, btnAnimals;

    //private IButtonOnClick _iBtn;

    //public MenuActivity(IButtonOnClick btn){
      //  this._iBtn = btn;
    //}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btnAnimals = findViewById(R.id.btnMenuAnimals);
        btnColors = findViewById(R.id.btnMenuColors);
        btnFruits = findViewById(R.id.btnMenuFruits);

        ButtonOnClick buttonOnClick = new ButtonOnClick();

        buttonOnClick.Click(btnAnimals, MenuActivity.this, AnimalsActivity.class);
        buttonOnClick.Click(btnColors, MenuActivity.this, ColorsActivity.class);
        buttonOnClick.Click(btnFruits, MenuActivity.this, FruitActivity.class);

        //this._iBtn.Click(btnAnimals, MenuActivity.this, AnimalsActivity.class);

    }

    @Override
    public void Click(Button btn, Context context, Class<?> clase) {

    }
}