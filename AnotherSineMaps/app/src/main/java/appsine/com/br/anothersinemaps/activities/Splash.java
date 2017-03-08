package appsine.com.br.anothersinemaps.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import appsine.com.br.anothersinemaps.R;
import appsine.com.br.anothersinemaps.entidades.Sine;


public class Splash extends Activity implements Runnable {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);


        Handler handler = new Handler();
        handler.postDelayed (this, 60000);

    }
//
    @Override
    public void run() {
        Intent i = new Intent(this, Sine.activity_gps.class);
        startActivity(i);
        finish();
    }}

