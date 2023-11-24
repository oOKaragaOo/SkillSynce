package com.example.skill_sync;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;

public class TutorReg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutor_reg);

        Button btn8 = (Button) findViewById(R.id.button8);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TutorReg.this, ChooseRole.class);
                startActivity(intent);
            }
        });

        Button btn7 = (Button) findViewById(R.id.button7);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TutorReg.this, ChooseRole.class);
                startActivity(intent);
            }
        });
    }
}