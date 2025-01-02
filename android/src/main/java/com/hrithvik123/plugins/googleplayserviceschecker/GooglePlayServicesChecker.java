package com.hrithvik123.plugins.googleplayserviceschecker;

import android.app.Activity;
import android.util.Log;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;

public class GooglePlayServicesChecker {

    private static final String TAG = "GooglePlayServicesChecker";

    private final GoogleApiAvailability googleApiAvailability;
    private final Activity activity;

    public GooglePlayServicesChecker(Activity activity) {
        this.activity = activity;
        this.googleApiAvailability = GoogleApiAvailability.getInstance();
    }

    public boolean isGooglePlayServicesAvailable() {
        int status = googleApiAvailability.isGooglePlayServicesAvailable(activity);

        if (status == ConnectionResult.SUCCESS) {
            Log.i(TAG, "Google Play Services are available.");
            return true;
        } else {
            Log.w(TAG, "Google Play Services are not available. Status code: " + status);
            return false;
        }
    }
}