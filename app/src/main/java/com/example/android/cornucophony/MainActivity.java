package com.example.android.cornucophony;

/*
 * Grow With Google Challenge Scholarship: Android Basics
 * Project: 4
 * Version: 1.0
 * App Name: Cornucophony
 * Author: Joseph McDonald
 */

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View.OnClickListener;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Declare String for noise category selected.
    static String categorySelected;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the app pronunciation text view.
        TextView appPronounce = findViewById(R.id.app_pronounce);

        // Find the noise category Buttons.
        Button buttonFun = findViewById(R.id.button_fun);
        Button buttonBody = findViewById(R.id.button_body);
        Button buttonHoliday = findViewById(R.id.button_holiday);
        Button buttonScary = findViewById(R.id.button_scary);
        Button buttonCornucophony = findViewById(R.id.button_cornucophony);

        // Declare and create MediaPlayer.
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.cornucophony);

        // Create mpOnClickListener for app pronunciation.
        OnClickListener mpOnClickListener = new OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
            }
        };

        // Create noiseOnClickListener for noise categories.
        OnClickListener noiseOnClickListener = new OnClickListener() {
            @Override
            public void onClick(View v) {
                // Based on selection, assign the categorySelected String.
                switch (v.getId()) {
                    case R.id.button_fun:
                        categorySelected = getString(R.string.category_fun);
                        break;

                    case R.id.button_body:
                        categorySelected = getString(R.string.category_body);
                        break;

                    case R.id.button_holiday:
                        categorySelected = getString(R.string.category_holiday);
                        break;

                    case R.id.button_scary:
                        categorySelected = getString(R.string.category_scary);
                        break;

                    case R.id.button_cornucophony:
                        categorySelected = getString(R.string.category_cornucophony);
                        break;
                }

                // Create and show a toast when category selected.
                String messageToast = categorySelected + getString(R.string.noises);
                Toast toast = Toast.makeText(MainActivity.this, messageToast, Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.BOTTOM, 0, 250);
                toast.show();

                // Go to the NoiseActivity.
                Intent intentNoise = new Intent(MainActivity.this, NoiseActivity.class);
                startActivity(intentNoise);
            }
        };

        // Set the mpOnClickListener to the app pronunciation text view.
        appPronounce.setOnClickListener(mpOnClickListener);

        // Set the noiseOnClickListener to the category Buttons.
        buttonFun.setOnClickListener(noiseOnClickListener);
        buttonBody.setOnClickListener(noiseOnClickListener);
        buttonHoliday.setOnClickListener(noiseOnClickListener);
        buttonScary.setOnClickListener(noiseOnClickListener);
        buttonCornucophony.setOnClickListener(noiseOnClickListener);
    }
}
