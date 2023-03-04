package com.andres.firstapp;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ButtonOnClick implements IButtonOnClick {
    private Button _btn;
    private ImageView _btnImage;

    @Override
    public void ClickIntent(Button btn, Context context, Class<?> clase) {
        _btn = btn;
        _btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, clase);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public void ClickSetText(ImageView btnImage, TextView txtView, String newText) {
        _btnImage = btnImage;
        _btnImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtView.setText(newText);
            }
        });
    }
}
