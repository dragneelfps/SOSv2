package com.example.sourabh.sos;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class WelcomeFirstTime extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("debug","in welcome..........");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_layout);
        final Button start = (Button) findViewById(R.id.start_button);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToConfigPage = new Intent(WelcomeFirstTime.this,MyAppConfig.class);
                startActivity(goToConfigPage);
            }
        });
    }
}
