package com.example.skill_sync;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ObjectAnimator;
import androidx.annotation.Nullable;
import android.os.Bundle;
import android.content.Intent;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {
    public ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBar = findViewById(R.id.progressBar);

        // Assuming you have a maximum value of 100 for the ProgressBar
        int maxValue = progressBar.getMax();

        ObjectAnimator progressAnimator = ObjectAnimator.ofInt(progressBar, "progress", 0, 100);
        progressAnimator.setDuration(3000); // 3000 milliseconds = 3 seconds

        progressAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animation) {
                // Animation complete, navigate to the next screen
                navigateToChooseRole();
            }
        });

        // Start the animation
        progressAnimator.start();
    }
    private void navigateToChooseRole() {
        // Create an Intent to navigate to the next Activity
        Intent intent = new Intent(this, ChooseRole.class);
        startActivity(intent);

        // Optional: Finish the current Activity to remove it from the back stack
        finish();

    }

}