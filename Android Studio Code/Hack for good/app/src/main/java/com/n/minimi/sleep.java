package com.n.minimi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;

public class sleep extends AppCompatActivity {
    private Chronometer timer;
    private long pauseOffset;
    private boolean running;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sleeppopup);

        timer = findViewById(R.id.timer);
        timer.setFormat("Rest Well: %s");
    }

    public void startTimer(View v) {
        if (!running) {
            timer.setBase(SystemClock.elapsedRealtime() - pauseOffset);
            timer.start();
            running = true;
        }
    }

    public void stopTimer(View v) {
        if (running) {
            timer.stop();
            pauseOffset = SystemClock.elapsedRealtime() - timer.getBase();
            running = false;
            Intent myIntent = new Intent(this, me.class);
            startActivity(myIntent);
        }
    }
}
