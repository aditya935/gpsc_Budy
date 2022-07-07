package com.techwithadi.gpscbudy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.techwithadi.gpscbudy.databinding.ActivitySplashBinding;

public class SplashActivity extends AppCompatActivity {
    ActivitySplashBinding binding;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySplashBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
//        binding.splashba.animate().translationY(-1600).setDuration(1000).setStartDelay(3000);
//        binding.logoimg.animate().translationY(1400).setDuration(1000).setStartDelay(3000);
//        binding.appname.animate().translationY(1400).setDuration(1000).setStartDelay(3000);
//        binding.animationView.animate().translationY(1400).setDuration(1000).setStartDelay(3000);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(SplashActivity.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        },4000);
    }
}