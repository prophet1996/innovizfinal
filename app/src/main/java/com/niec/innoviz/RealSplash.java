package com.niec.innoviz;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;


public class RealSplash extends AppCompatActivity {

    private static int SPLASH_TIME_OUT=3000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_real_splash);





        new Handler().postDelayed(new Runnable() {

            public void run() {
                Intent i = new Intent(RealSplash.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        }, SPLASH_TIME_OUT);

    }



}


