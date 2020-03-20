package com.n.minimi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Purchase extends Shop {
    EditText code;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_purchase);
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        int width = dm.widthPixels;
        int height = dm.heightPixels;
        getWindow().setLayout((int)(width * 0.8),(int)(height * 0.6));
        code = findViewById(R.id.pin);
        Button unlock = (Button) findViewById(R.id.unlock);
        unlock.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (code.getText().toString().equals("123")) {
                    Intent myIntent = new Intent(view.getContext(), Shop.class);
                    showToast("Item Unlocked");
                    startActivity(myIntent);
                } else {
                    showToast("Wrong unlock code");
                }
            }
        });
    }

    private void showToast(String text){
        Toast.makeText(Purchase.this,text, Toast.LENGTH_SHORT).show();
    }
}