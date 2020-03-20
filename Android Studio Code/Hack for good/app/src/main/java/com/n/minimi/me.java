package com.n.minimi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class me extends AppCompatActivity {
    Dialog myDialog;
    User game = new User(175,60);
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_me);
        Button next = (Button) findViewById(R.id.slp);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), sleep.class);
                startActivity(myIntent);
            }
        });

        Button exercise = (Button) findViewById(R.id.exercise);
        exercise.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), ExerciseActivity.class);
                startActivity(myIntent);
            }
        });

        Button eat = (Button) findViewById(R.id.eat);
        eat.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), EatActivity.class);
                startActivity(myIntent);
            }
        });

        Button social = (Button) findViewById(R.id.social);
        social.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), Social.class);
                startActivity(myIntent);
            }
        });

        Button stress = (Button) findViewById(R.id.stress);
        stress.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), StressActivity.class);
                startActivity(myIntent);
            }
        });


        //Initialize and assign variable
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        //set home selected
        bottomNavigationView.setSelectedItemId(R.id.mi);

        //perform item selected listener
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.stats:
                        startActivity(new Intent(getApplicationContext(),
                                Dashboard.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.chat:
                        startActivity(new Intent(getApplicationContext(),
                                MainActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.shop:
                        startActivity(new Intent(getApplicationContext(),
                                Shop.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.mi:
                        return true;
                }

                return false;
            }
        });
    }


}
