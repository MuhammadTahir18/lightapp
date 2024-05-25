package com.example.torchlight;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class splashScreen extends AppCompatActivity {

    private static final int SPLASH_DISPLAY_LENGTH = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);


        new Handler().postDelayed(() -> {
            Intent mainIntent = new Intent(splashScreen.this, MainActivity.class);
            splashScreen.this.startActivity(mainIntent);
            splashScreen.this.finish();
        }, SPLASH_DISPLAY_LENGTH);
    }
}