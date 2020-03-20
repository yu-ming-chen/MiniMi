package com.n.minimi;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Chronometer;

import androidx.appcompat.app.AppCompatActivity;

public class Social extends AppCompatActivity {
    private Chronometer timer;
    private long pauseOffset;
    private boolean running;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.socialpopup);

        timer = findViewById(R.id.timer);
        timer.setFormat("Have fun!: %s");
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
