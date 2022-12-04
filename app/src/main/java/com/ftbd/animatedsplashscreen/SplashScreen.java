package com.ftbd.animatedsplashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashScreen extends AppCompatActivity {

    ImageView splash_image;
    TextView splash_text;
    Animation up,down;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        down = AnimationUtils.loadAnimation(this,R.anim.down);
        up = AnimationUtils.loadAnimation(this,R.anim.up);

        splash_image = findViewById(R.id.splash_image);
        splash_text = findViewById(R.id.splash_text);

        splash_image.setAnimation(down);
        splash_text.setAnimation(up);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen.this,
                        MainActivity.class);
                startActivity(intent);
            }
        },3000);

    }
}