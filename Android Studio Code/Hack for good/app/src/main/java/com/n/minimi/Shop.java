package com.n.minimi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class Shop extends AppCompatActivity {

//    private List<Item> myItems;
//    private List<Item> shopItems;
//
//    Shop(List<Item> shopItems){
//        this.myItems = new ArrayList<>();
//        this.shopItems = shopItems;
//    }
//
//    public void purchase(Item item){
//        myItems.add(item);
//        shopItems.remove(item);
//    }
//
//    public boolean contains(Item item){
//        return myItems.contains(item);
//    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);

        Button purchase = (Button) findViewById(R.id.purchase);
        purchase.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), Purchase.class);
                startActivity(myIntent);
            }
        });

        //Initialize and assign variable
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        //set home selected
        bottomNavigationView.setSelectedItemId(R.id.shop);

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
                        return true;
                    case R.id.mi:
                        startActivity(new Intent(getApplicationContext(),
                                me.class));
                        overridePendingTransition(0,0);
                        return true;
                }

                return false;
            }
        });
    }
}