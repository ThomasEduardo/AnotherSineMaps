package appsine.com.br.anothersinemaps.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import appsine.com.br.anothersinemaps.R;

/**
 * Created by thoma on 08/03/2017.
 */

    public class MainActivity extends Activity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }







    public void butGPS (View view) {
        Intent intent = new Intent(this, GpsActivity.class);
            startService(intent);
        }

        public void butCidade (View view){
            Intent intent = new Intent(this, CityActivity.class);
            startService(intent);
        }
    }

