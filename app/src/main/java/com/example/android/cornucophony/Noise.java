package com.example.android.cornucophony;

/*
 * Grow With Google Challenge Scholarship: Android Basics
 * Project: 4
 * Version: 1.0
 * App Name: Cornucophony
 * Author: Joseph McDonald
 */

public class Noise {

    /**
     * Declare the noise title.
     */
    private final String mNoiseTitle;

    /**
     * Declare the noise duration.
     */
    private final String mNoiseDuration;

    /**
     * Declare the noise category.
     */
    private final String mNoiseCategory;

    /**
     * Create a new Noise object.
     *
     * @param noiseTitle the noise title
     * @param noiseDuration the noise duration
     * @param noiseCategory this noise category
     */
    public Noise(String noiseTitle, String noiseDuration, String noiseCategory) {
        mNoiseTitle = noiseTitle;
        mNoiseDuration = noiseDuration;
        mNoiseCategory = noiseCategory;
    }

    /**
     * Get the noise title.
     */
    public String getNoiseTitle() {
        return mNoiseTitle;
    }

    /**
     * Get the noise duration.
     */
    public String getNoiseDuration() {
        return mNoiseDuration;
    }

    /**
     * Get the noise category.
     */
    public String getNoiseCategory() {
        return mNoiseCategory;
    }
}
