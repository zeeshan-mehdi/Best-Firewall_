package com.shaikhutech.netguard;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import eu.faircode.netguard.ActivityMain;

public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        try {
           // getSupportActionBar().hide();
            getActionBar().hide();
        }catch (Exception e){
            //ignore
        }


        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(getApplicationContext(), ActivityMain.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                finish();
            }
        },3000);
    }
}
