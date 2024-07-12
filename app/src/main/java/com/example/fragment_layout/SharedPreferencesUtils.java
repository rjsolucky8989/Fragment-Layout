package com.example.fragment_layout;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPreferencesUtils {

    private static final String PREFERENCES_FILE = "my_app_preferences";
    private static final String KEY_SPLASH_SHOWN = "splash_shown";

    public static boolean isSplashShown(Context context) {
        SharedPreferences preferences = context.getSharedPreferences(PREFERENCES_FILE, Context.MODE_PRIVATE);
        return preferences.getBoolean(KEY_SPLASH_SHOWN, false);
    }

    public static void setSplashShown(Context context, boolean shown) {
        SharedPreferences preferences = context.getSharedPreferences(PREFERENCES_FILE, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putBoolean(KEY_SPLASH_SHOWN, shown);
        editor.apply();
    }
}
