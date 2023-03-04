package com.andres.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ColorsActivity extends AppCompatActivity {

    TextView txtRed, txtOrange, txtBlue;
    ImageView btnRed, btnOrange, btnBlue;
    private ButtonOnClick _buttonOnClick;

    public ColorsActivity(){
        _buttonOnClick = new ButtonOnClick();
    }
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        /* Inicializacion TextView */
        txtRed = findViewById(R.id.txtRedColors);
        txtOrange = findViewById(R.id.txtOrangeColors);
        txtBlue = findViewById(R.id.txtBlueColors);

        /* Inicializacion ImageView */
        btnRed = findViewById(R.id.btnRedColors);
        btnOrange = findViewById(R.id.btnOrangeColors);
        btnBlue = findViewById(R.id.btnBlueColors);

        _buttonOnClick.ClickSetText(btnRed, txtRed, getString(R.string.red_colors));
        _buttonOnClick.ClickSetText(btnOrange, txtOrange, getString(R.string.orange_colors));
        _buttonOnClick.ClickSetText(btnBlue, txtBlue, getString(R.string.blue_colors));
    }
}