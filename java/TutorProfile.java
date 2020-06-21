package com.example.tuder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class TutorProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutor_profile);
        
        ImageButton setting = (ImageButton)findViewById(R.id.setting);
        setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent settingScreen = new Intent(getApplicationContext(), Setting.class);
                startActivity(settingScreen);
            }
        });

        ImageButton home = (ImageButton)findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeScreen = new Intent(getApplicationContext(), Home.class);
                startActivity(homeScreen);
            }
        });

        ImageButton chat = (ImageButton)findViewById(R.id.chat);
        chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent chatScreen = new Intent(getApplicationContext(), Chat.class);
                startActivity(chatScreen);
            }
        });
    }
    }
}
