package com.example.tuder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        Button student =  (Button)findViewById(R.id.button);
        student.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent studentSign = new Intent(getApplicationContext(), StudentProfile.class);
                startActivity(studentSign);
            }
        });
        Button tutor = (Button)findViewById(R.id.button2);
        tutor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tutorSign = new Intent(getApplicationContext(), TutorProfile.class);
                startActivity(tutorSign);
            }
        });
    }
}
