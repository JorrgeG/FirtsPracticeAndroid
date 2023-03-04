package com.andres.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ColorsActivity extends AppCompatActivity {

    TextView txtRed, txtOrange, txtBlue;
    ImageView btnRed, btnOrange, btnBlue;
    MediaPlayer mediaRed, mediaOrange, mediaBlue;

    private ButtonOnClick _buttonOnClick;

    public ColorsActivity(){
        _buttonOnClick = new ButtonOnClick();
    }
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        /* Sonidos */
        mediaRed = MediaPlayer.create(this, R.raw.red);
        mediaOrange = MediaPlayer.create(this, R.raw.orange);
        mediaBlue = MediaPlayer.create(this, R.raw.blue);

        /* Inicializacion TextView */
        txtRed = findViewById(R.id.txtRedColors);
        txtOrange = findViewById(R.id.txtOrangeColors);
        txtBlue = findViewById(R.id.txtBlueColors);

        /* Inicializacion ImageView */
        btnRed = findViewById(R.id.btnRedColors);
        btnOrange = findViewById(R.id.btnOrangeColors);
        btnBlue = findViewById(R.id.btnBlueColors);

        _buttonOnClick.ClickSetActions(btnRed, txtRed, getString(R.string.red_colors), mediaRed);
        _buttonOnClick.ClickSetActions(btnOrange, txtOrange, getString(R.string.orange_colors), mediaOrange);
        _buttonOnClick.ClickSetActions(btnBlue, txtBlue, getString(R.string.blue_colors), mediaBlue);

    }
}