package com.n.minimi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
/*
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
*/
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import java.util.ArrayList;

public class Dashboard extends AppCompatActivity {
    BarChart barChart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        barChart = (BarChart) findViewById(R.id.bargraph);

        ArrayList<BarEntry> barEntries = new ArrayList<>();
        barEntries.add(new BarEntry(44f,0));
        barEntries.add(new BarEntry(88f,1));
        barEntries.add(new BarEntry(66f,2));
        barEntries.add(new BarEntry(12f,3));
        barEntries.add(new BarEntry(18f,4));
        BarDataSet barDataSet = new BarDataSet(barEntries, "amount");

        ArrayList<String> miAttributes = new ArrayList<>();
        miAttributes.add("FINESS");
        miAttributes.add("STRESS");
        miAttributes.add("SOCIAL");
        miAttributes.add("NUTRITION");
        miAttributes.add("SLEEP");


        BarData theData = new BarData(miAttributes,barDataSet);
        barChart.setData(theData);

        //Initialize and assign variable
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        //set home selected
        bottomNavigationView.setSelectedItemId(R.id.stats);

        //perform item selected listener
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.stats:
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
