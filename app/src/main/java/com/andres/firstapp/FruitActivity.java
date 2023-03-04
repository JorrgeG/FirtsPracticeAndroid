package com.andres.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class FruitActivity extends AppCompatActivity {

    TextView txtApple, txtCoconut, txtBanana;
    ImageView btnApple, btnCoconut, btnBanana;
    private ButtonOnClick _buttonOnClick;

    public FruitActivity(){
        _buttonOnClick = new ButtonOnClick();
    }
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruit);

        /* Inicializacion TextView */
        txtApple = findViewById(R.id.txtAppleFruits);
        txtCoconut = findViewById(R.id.txtCoconutFruits);
        txtBanana = findViewById(R.id.txtBananaFruits);

        /* Inicializacion ImageView */
        btnApple = findViewById(R.id.btnAppleFruits);
        btnCoconut = findViewById(R.id.btnCoconutFruits);
        btnBanana = findViewById(R.id.btnBananaFruits);

        _buttonOnClick.ClickSetText(btnApple, txtApple, getString(R.string.apple_fruits));
        _buttonOnClick.ClickSetText(btnCoconut, txtCoconut, getString(R.string.coconut));
        _buttonOnClick.ClickSetText(btnBanana, txtBanana, getString(R.string.banana_fruits));
    }
}