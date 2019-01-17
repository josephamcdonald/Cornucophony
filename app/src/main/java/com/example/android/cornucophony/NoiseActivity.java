package com.example.android.cornucophony;

/*
 * Grow With Google Challenge Scholarship: Android Basics
 * Project: 4
 * Version: 1.0
 * App Name: Cornucophony
 * Author: Joseph McDonald
 */

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class NoiseActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    // Declare noises ArrayList.
    private final ArrayList<Noise> noises = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.noise_list);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(MainActivity.categorySelected + getString(R.string.noises));

        if (MainActivity.categorySelected.equals(getString(R.string.category_fun))) {
            addFunNoises();

        } else if (MainActivity.categorySelected.equals(getString(R.string.category_body))) {
            addBodyNoises();

        } else if (MainActivity.categorySelected.equals(getString(R.string.category_scary))) {
            addScaryNoises();

        } else if (MainActivity.categorySelected.equals(getString(R.string.category_holiday))) {
            addHolidayNoises();

        } else {
            // Add all the noises. Bring the NOISE!
            addFunNoises();
            addBodyNoises();
            addScaryNoises();
            addHolidayNoises();
        }

        // Declare the NoiseAdapter.
        NoiseAdapter noiseAdapter = new NoiseAdapter(this, noises);

        // Find the noise list view.
        final ListView listViewNoise = findViewById(R.id.noise_list);

        // Set noiseAdapter to the noise list view.
        listViewNoise.setAdapter(noiseAdapter);

        // Set OnItemClickListener to listViewNoise.
        listViewNoise.setOnItemClickListener(this);
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

        // Create and show toast when any item clicked.
        String messageToast = noises.get(i).getNoiseCategory() + getString(R.string.space) +
                noises.get(i).getNoiseTitle().toLowerCase() + getString(R.string.noisey);
        Toast toast = Toast.makeText(NoiseActivity.this, messageToast, Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.BOTTOM, 0, 250);
        toast.show();
    }

    // Add the "Fun" noises to the noises ArrayList.
    private void addFunNoises() {
        noises.add(new Noise(getString(R.string.title_applause), getString(R.string.duration_applause), getString(R.string.category_fun)));
        noises.add(new Noise(getString(R.string.title_boing), getString(R.string.duration_boing), getString(R.string.category_fun)));
        noises.add(new Noise(getString(R.string.title_drumroll), getString(R.string.duration_drumroll), getString(R.string.category_fun)));
        noises.add(new Noise(getString(R.string.title_womp_womp), getString(R.string.duration_womp_womp), getString(R.string.category_fun)));
        noises.add(new Noise(getString(R.string.title_rimshot), getString(R.string.duration_rimshot), getString(R.string.category_fun)));
        noises.add(new Noise(getString(R.string.title_crying_baby), getString(R.string.duration_crying_baby), getString(R.string.category_fun)));
        noises.add(new Noise(getString(R.string.title_old_horn), getString(R.string.duration_old_horn), getString(R.string.category_fun)));
        noises.add(new Noise(getString(R.string.title_wind_chimes), getString(R.string.duration_wind_chimes), getString(R.string.category_fun)));
        noises.add(new Noise(getString(R.string.title_yippee), getString(R.string.duration_yippee), getString(R.string.category_fun)));
        noises.add(new Noise(getString(R.string.title_guitar), getString(R.string.duration_guitar), getString(R.string.category_fun)));
    }

    // Add the "Body" noises to the noises ArrayList.
    private void addBodyNoises() {
        noises.add(new Noise(getString(R.string.title_sneeze), getString(R.string.duration_sneeze), getString(R.string.category_body)));
        noises.add(new Noise(getString(R.string.title_burp), getString(R.string.duration_burp), getString(R.string.category_body)));
        noises.add(new Noise(getString(R.string.title_hurl), getString(R.string.duration_hurl), getString(R.string.category_body)));
        noises.add(new Noise(getString(R.string.title_hiccup), getString(R.string.duration_hiccup), getString(R.string.category_body)));
        noises.add(new Noise(getString(R.string.title_fart), getString(R.string.duration_fart), getString(R.string.category_body)));
        noises.add(new Noise(getString(R.string.title_belch), getString(R.string.duration_belch), getString(R.string.category_body)));
        noises.add(new Noise(getString(R.string.title_long_fart), getString(R.string.duration_long_fart), getString(R.string.category_body)));
        noises.add(new Noise(getString(R.string.title_long_belch), getString(R.string.duration_long_belch), getString(R.string.category_body)));
        noises.add(new Noise(getString(R.string.title_cough), getString(R.string.duration_cough), getString(R.string.category_body)));
        noises.add(new Noise(getString(R.string.title_toilet_flush), getString(R.string.duration_toilet_flush), getString(R.string.category_body)));
    }

    // Add the "Scary" noises to the noises ArrayList.
    private void addScaryNoises() {
        noises.add(new Noise(getString(R.string.title_chains), getString(R.string.duration_chains), getString(R.string.category_scary)));
        noises.add(new Noise(getString(R.string.title_evil_laugh), getString(R.string.duration_evil_laugh), getString(R.string.category_scary)));
        noises.add(new Noise(getString(R.string.title_happy_halloween), getString(R.string.duration_happy_halloween), getString(R.string.category_scary)));
        noises.add(new Noise(getString(R.string.title_scream), getString(R.string.duration_scream), getString(R.string.category_scary)));
        noises.add(new Noise(getString(R.string.title_witch), getString(R.string.duration_witch), getString(R.string.category_scary)));
        noises.add(new Noise(getString(R.string.title_ghost), getString(R.string.duration_ghost), getString(R.string.category_scary)));
        noises.add(new Noise(getString(R.string.title_creaky_door), getString(R.string.duration_creaky_door), getString(R.string.category_scary)));
        noises.add(new Noise(getString(R.string.title_bats), getString(R.string.duration_bats), getString(R.string.category_scary)));
        noises.add(new Noise(getString(R.string.title_moan), getString(R.string.duration_moan), getString(R.string.category_scary)));
        noises.add(new Noise(getString(R.string.title_haunted_organ), getString(R.string.duration_haunted_organ), getString(R.string.category_scary)));
    }

    // Add the "Holiday" noises to the noises ArrayList.
    private void addHolidayNoises() {
        noises.add(new Noise(getString(R.string.title_church_bells), getString(R.string.duration_church_bells), getString(R.string.category_holiday)));
        noises.add(new Noise(getString(R.string.title_ho_ho_ho), getString(R.string.duration_ho_ho_ho), getString(R.string.category_holiday)));
        noises.add(new Noise(getString(R.string.title_merry_xmas), getString(R.string.duration_merry_xmas), getString(R.string.category_holiday)));
        noises.add(new Noise(getString(R.string.title_sleigh_bells), getString(R.string.duration_sleigh_bells), getString(R.string.category_holiday)));
        noises.add(new Noise(getString(R.string.title_jolly_elf), getString(R.string.duration_jolly_elf), getString(R.string.category_holiday)));
        noises.add(new Noise(getString(R.string.title_happy_holidays), getString(R.string.duration_happy_holidays), getString(R.string.category_holiday)));
        noises.add(new Noise(getString(R.string.title_christmas_bell), getString(R.string.duration_christmas_bell), getString(R.string.category_holiday)));
        noises.add(new Noise(getString(R.string.title_happy_new_year), getString(R.string.duration_happy_new_year), getString(R.string.category_holiday)));
        noises.add(new Noise(getString(R.string.title_silent_night), getString(R.string.duration_silent_night), getString(R.string.category_holiday)));
        noises.add(new Noise(getString(R.string.title_jingle_bells), getString(R.string.duration_jingle_bells), getString(R.string.category_holiday)));
    }
}
