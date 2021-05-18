package com.example.splashanimacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Splash extends AppCompatActivity {
    public static final long SPLASH_SCREEN_DELAY = 4000;

    Animation topAnim, botonAnim;
    ImageView ivImagen;
    TextView txtTexto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //animacion

        topAnim= AnimationUtils.loadAnimation(this,R.anim.topanimacion);
        botonAnim= AnimationUtils.loadAnimation(this,R.anim.botonanimacion);

        //logo y diseño
        ivImagen= findViewById(R.id.ivImagen);
        txtTexto= findViewById(R.id.txtTexto);

        ivImagen.setAnimation(topAnim);
        txtTexto.setAnimation(botonAnim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(Splash.this,Login.class);
                startActivity(intent);
                finish();
            }

        },SPLASH_SCREEN_DELAY);

    }
}