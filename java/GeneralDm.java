package com.example.tuder;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class GeneralDm extends AppCompatActivity {
    ListView listView;
    String mTitle[] = {"Mr. Goldfield", "Mr. Parkinson", "Mr. Chapleau", "Ms. Hollins"};
    String mDescription [] = {"Hello! When do you want to start your lesson?", " ", " ", " ", " "};
    int images[] = {R.drawable.dm_tutor1,R.drawable.dm_tutor2,R.drawable.dm_tutor3,R.drawable.dm_tutor4 };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dm);
        listView = findViewById(R.id.listView);
        MyAdapter adapter = new MyAdapter (this, mTitle, mDescription, images);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                    Toast.makeText(GeneralDm.this, "Chat with Mr. Goldfield", Toast.LENGTH_SHORT).show();
                    openActivity2();
                }
                if (position == 0){
                    Toast.makeText(GeneralDm.this, "Chat with Mr. Parkinson", Toast.LENGTH_SHORT).show();
                }
                if (position == 0){
                    Toast.makeText(GeneralDm.this, "Chat with Mr. Chapleau", Toast.LENGTH_SHORT).show();
                }
                if (position == 0){
                    Toast.makeText(GeneralDm.this, "Chat with Mrs. Hollins", Toast.LENGTH_SHORT).show();
                }
            }

        });


    }

    private void openActivity2() {
        Intent intent = new Intent (this, GoldfieldDm.class);
        startActivity(intent);
    }

    class MyAdapter extends ArrayAdapter<String>{
        Context context;
        String rTitle[];
        String rDescription[];
        int rImgs[];

        MyAdapter (Context c, String title[], String description [], int imgs[]){
            super(c, R.layout.activity_dmlist, R.id.textView1, title);
            this.context = c;
            this.rTitle=title;
            this.rDescription = description;
            this.rImgs = imgs;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.activity_dmlist,parent, false);
            ImageView images = row.findViewById(R.id.image);
            TextView myTitle = row.findViewById(R.id.textView1);
            TextView myDescription = row.findViewById(R.id.textView2);
            images.setImageResource(rImgs[position]);
            myTitle.setText(rTitle[position]);
            myDescription.setText(rDescription[position]);
            return row;

        }
    }
}