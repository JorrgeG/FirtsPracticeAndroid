package com.andres.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class FruitActivity extends AppCompatActivity {

    TextView txtApple, txtCoconut, txtBanana;
    ImageView btnApple, btnCoconut, btnBanana;
    MediaPlayer mediaApple, mediaCoconut, mediaBanana;

    private ButtonOnClick _buttonOnClick;

    public FruitActivity(){
        _buttonOnClick = new ButtonOnClick();
    }
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruit);

        /* Sonidos */
        mediaApple = MediaPlayer.create(this, R.raw.apple);
        mediaCoconut = MediaPlayer.create(this, R.raw.coconut);
        mediaBanana = MediaPlayer.create(this, R.raw.banana);

        /* Inicializacion TextView */
        txtApple = findViewById(R.id.txtAppleFruits);
        txtCoconut = findViewById(R.id.txtCoconutFruits);
        txtBanana = findViewById(R.id.txtBananaFruits);

        /* Inicializacion ImageView */
        btnApple = findViewById(R.id.btnAppleFruits);
        btnCoconut = findViewById(R.id.btnCoconutFruits);
        btnBanana = findViewById(R.id.btnBananaFruits);

        _buttonOnClick.ClickSetActions(btnApple, txtApple, getString(R.string.apple_fruits), mediaApple);
        _buttonOnClick.ClickSetActions(btnCoconut, txtCoconut, getString(R.string.coconut), mediaCoconut);
        _buttonOnClick.ClickSetActions(btnBanana, txtBanana, getString(R.string.banana_fruits), mediaBanana);
    }
}