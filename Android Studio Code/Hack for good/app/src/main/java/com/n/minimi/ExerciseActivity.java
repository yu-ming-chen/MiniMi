package com.n.minimi;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ExerciseActivity extends AppCompatActivity {
    int time;
    String exercise;
    EditText number;
    EditText text;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);
        button = (Button) findViewById(R.id.button);
        number = findViewById(R.id.timeBtn);
        text = findViewById(R.id.nameBtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exercise = text.getText().toString();
                time = Integer.parseInt(number.getText().toString());
                showToast("Activity: " + exercise + " | Duration: " + time +"mins");
                Intent myIntent = new Intent(v.getContext(), me.class);
                startActivity(myIntent);
            }
        });

        
    }
    private void showToast(String text){
        Toast.makeText(ExerciseActivity.this,text, Toast.LENGTH_SHORT).show();
    }

}
