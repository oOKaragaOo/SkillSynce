package com.example.skill_sync;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StudentReg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_reg);

        Button btn8 = (Button) findViewById(R.id.button8);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StudentReg.this, com.example.skill_sync.ChooseRole.class);
                startActivity(intent);
            }
        });

        Button btn7 = (Button) findViewById(R.id.button7);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StudentReg.this, com.example.skill_sync.ChooseRole.class);
                startActivity(intent);
            }
        });
    }
}