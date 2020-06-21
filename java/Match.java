package com.example.tuder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Match extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match);


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

        Button chatting = (Button)findViewById(R.id.matchBtn);
        chatting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent chatScreen = new Intent(getApplicationContext(), Chat.class);
                startActivity(chatScreen);
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

    }
}
