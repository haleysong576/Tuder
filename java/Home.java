package com.example.tuder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ImageButton setting = (ImageButton)findViewById(R.id.setting);
        setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent settingScreen = new Intent(getApplicationContext(), Setting.class);
                startActivity(settingScreen);
            }
        });

        ImageButton profile = (ImageButton)findViewById(R.id.profile);
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent profileScreen = new Intent(getApplicationContext(), TutorProfile.class);
                startActivity(profileScreen);
            }
        });

        ImageButton chat = (ImageButton)findViewById(R.id.chat);
        chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent chatScreen = new Intent(getApplicationContext(), GeneralDm.class);
                startActivity(chatScreen);
            }
        });
    }
}
