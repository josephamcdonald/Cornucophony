package com.example.android.cornucophony;

/*
 * Grow With Google Challenge Scholarship: Android Basics
 * Project: 4
 * Version: 1.0
 * App Name: Cornucophony
 * Author: Joseph McDonald
 */

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class NoiseAdapter extends ArrayAdapter<Noise> {

    public NoiseAdapter(Context context, ArrayList<Noise> noises) {
        super(context,0, noises);
    }

    @NonNull
    @Override
    public View getView(int arrayPosition, View incomingView, @NonNull ViewGroup parent) {

        // Assign the incoming view to a noise item view variable.
        View viewNoiseItem = incomingView;

        // Check that noise item is not NULL.
        if(viewNoiseItem == null) {
            viewNoiseItem = LayoutInflater.from(getContext()).inflate(R.layout.noise_item, parent, false);
        }

        // Assign the current noise in the ArrayList to a Noise variable.
        Noise currentNoise = getItem(arrayPosition);

        // Find and set the text of the current Noise item title.
        TextView titleTextView = viewNoiseItem.findViewById(R.id.title_noise);
        titleTextView.setText(currentNoise.getNoiseTitle());

        // Find and set the text of the current Noise item duration.
        TextView durationTextView = viewNoiseItem.findViewById(R.id.duration_noise);
        durationTextView.setText(currentNoise.getNoiseDuration());

        return viewNoiseItem;
    }
}
