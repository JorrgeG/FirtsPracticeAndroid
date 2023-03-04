package com.andres.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class AnimalsActivity extends AppCompatActivity {

    TextView txtCat, txtDog, txtSnake;
    ImageView btnCat, btnDog, btnSnake;
    MediaPlayer mediaCat, mediaDog, mediaSnake;

    private ButtonOnClick _buttonOnClick;

    public AnimalsActivity(){
        _buttonOnClick = new ButtonOnClick();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animals);

        /* Sonidos */
        mediaCat = MediaPlayer.create(this, R.raw.cat);
        mediaDog = MediaPlayer.create(this, R.raw.dog);
        mediaSnake = MediaPlayer.create(this, R.raw.snake);

        /* Inicializacion TextView */
        txtCat = findViewById(R.id.txtCatAnimals);
        txtDog = findViewById(R.id.txtDogAnimals);
        txtSnake = findViewById(R.id.txtSnakeAnimals);

        /* Inicializacion ImageView */
        btnCat = findViewById(R.id.btnCatAnimals);
        btnDog = findViewById(R.id.btnDogAnimals);
        btnSnake = findViewById(R.id.btnSnakeAnimals);

        _buttonOnClick.ClickSetActions(btnCat, txtCat, getString(R.string.cat_animals), mediaCat);
        _buttonOnClick.ClickSetActions(btnDog, txtDog, getString(R.string.dog_animals), mediaDog);
        _buttonOnClick.ClickSetActions(btnSnake, txtSnake, getString(R.string.snake_animals), mediaSnake);
    }
}