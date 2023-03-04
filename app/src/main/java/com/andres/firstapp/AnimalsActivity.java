package com.andres.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class AnimalsActivity extends AppCompatActivity {

    TextView txtCat, txtDog, txtSnake;
    ImageView btnCat, btnDog, btnSnake;
    private ButtonOnClick _buttonOnClick;

    public AnimalsActivity(){
        _buttonOnClick = new ButtonOnClick();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animals);

        /* Inicializacion TextView */
        txtCat = findViewById(R.id.txtCatAnimals);
        txtDog = findViewById(R.id.txtDogAnimals);
        txtSnake = findViewById(R.id.txtSnakeAnimals);

        /* Inicializacion ImageView */
        btnCat = findViewById(R.id.btnCatAnimals);
        btnDog = findViewById(R.id.btnDogAnimals);
        btnSnake = findViewById(R.id.btnSnakeAnimals);

        _buttonOnClick.ClickSetText(btnCat, txtCat, getString(R.string.cat_animals));
        _buttonOnClick.ClickSetText(btnDog, txtDog, getString(R.string.dog_animals));
        _buttonOnClick.ClickSetText(btnSnake, txtSnake, getString(R.string.snake_animals));
    }
}