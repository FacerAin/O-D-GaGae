package com.example.o_d_gagae;

import androidx.preference.PreferenceFragmentCompat;

import android.os.Bundle;

public class SettingActivity extends PreferenceFragmentCompat {

    @Override
    public void onCreatePreferences(Bundle bundle, String s) {
        setPreferencesFromResource(R.xml.settings_preference,s);
    }
}