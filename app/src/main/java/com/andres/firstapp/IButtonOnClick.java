package com.andres.firstapp;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public interface IButtonOnClick {
    // Evento OnClick para cambiar de View
    void ClickIntent(Button btn, android.content.Context context, Class<?> clase );

    // Evento OnClick para cambiar texto
    void ClickSetText(ImageView btnImage, TextView txtView, String newText);
}
