package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class splash_screen extends AppCompatActivity {

    private static int timer = 4000;

    ImageView imageView;
    TextView textView;
    Animation upperanimation,bottomanimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.splashscreen);

        imageView = findViewById(R.id.logo1);
        textView = findViewById(R.id.credit);

        upperanimation = AnimationUtils.loadAnimation(this,R.anim.upper_animation);
        bottomanimation = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);

        imageView.setAnimation(upperanimation);
        textView.setAnimation(bottomanimation);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent(splash_screen.this,selection.class);
                startActivity(intent);
                finish();
            }
        },timer);
    }
}