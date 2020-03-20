package com.n.minimi;


import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class StressActivity extends AppCompatActivity {
    Button happy;
    Button ok;
    Button sad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stress);

        happy = (Button) findViewById(R.id.happyBtn);
        happy.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), me.class);
                startActivity(myIntent);
                //pass value to db
            }
        });

        ok = (Button) findViewById(R.id.okBtn);
        ok.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), me.class);
                startActivity(myIntent);
                //pass value to db
            }
        });

        sad = (Button) findViewById(R.id.sadBtn);
        sad.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), me.class);
                startActivity(myIntent);
                //pass value to db
            }
        });

    }
}
