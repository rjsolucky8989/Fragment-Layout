package com.example.fragment_layout;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread splashThread = new Thread() {
            @Override
            public void run() {
                try {
                    sleep(3000); // 3 seconds delay
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    // Save flag indicating splash screen has been shown
                    SharedPreferencesUtils.setSplashShown(SplashActivity.this, true);

                    Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        };

        splashThread.start();
    }
}
