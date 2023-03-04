package com.andres.firstapp;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class ButtonOnClick implements IButtonOnClick {
    private Button _btn;

    public ButtonOnClick (){
    }

    @Override
    public void Click(Button btn, Context context, Class<?> clase) {
        _btn = btn;
        _btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, clase);
                context.startActivity(intent);
            }
        });
    }
}
