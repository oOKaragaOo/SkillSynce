package com.example.skill_sync;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class acticity_setting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acticity_setting);

        Button btnSignout = (Button) findViewById(R.id.button15);
        Button backSetting = (Button) findViewById(R.id.button13);
        backSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(acticity_setting.this, activity_home.class);
                startActivity(intent);
            }
        });
        btnSignout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(acticity_setting.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
//5555