package com.example.slawek.sdacademyaplikacja;

import android.content.Intent;
import android.os.Bundle;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Slawek on 27.05.2017.
 */

public class SplashActivity extends AppCompatActivity {
    private int splashTime = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        splash(splashTime);
    }
    private void splash(int time) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //intent odpalenia docelowej aktywnosci
                Intent mainIntent = new Intent(SplashActivity.this, RegisterActivity.class);
                startActivity(mainIntent);
                //finish zamyka nasza aplikace, jesli tego nie zrobimy dowktywnosci bedziemy mogli
                //wrocic
                finish();
            }
            //splash screen w milisekundach 3000 = 3 sekundy
        }, time);
    }
}
