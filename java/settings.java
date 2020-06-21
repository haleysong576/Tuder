package com.example.settingsactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
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
                Intent chatScreen = new Intent(getApplicationContext(), Chat.class);
                startActivity(chatScreen);
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
    }
}
