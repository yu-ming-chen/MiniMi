package com.n.minimi;

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
    int calories;
    String dish;

    EditText number;
    EditText text;

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dish = text.getText().toString();
                calories = Integer.parseInt(number.getText().toString());

                showToast(dish);
                showToast(String.valueOf(calories));
            }
        });

        
    }
    private void showToast(String text){
        Toast.makeText(ExerciseActivity.this,text, Toast.LENGTH_SHORT).show();
    }

}
