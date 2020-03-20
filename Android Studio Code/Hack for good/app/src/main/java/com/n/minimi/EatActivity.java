package com.n.minimi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class EatActivity extends AppCompatActivity {
    int calories;
    String dish;
    EditText number;
    EditText text;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eat);
        button = (Button) findViewById(R.id.button);
        number = findViewById(R.id.timeBtn);
        text = findViewById(R.id.nameBtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dish = text.getText().toString();
                calories = Integer.parseInt(number.getText().toString());
                showToast("Food: " + dish + " | Cal: " + String.valueOf(calories) + "kcal");
                Intent myIntent = new Intent(v.getContext(), me.class);
                startActivity(myIntent);
            }
        });
    }

    private void showToast(String text){
        Toast.makeText(EatActivity.this,text, Toast.LENGTH_SHORT).show();
    }

}
