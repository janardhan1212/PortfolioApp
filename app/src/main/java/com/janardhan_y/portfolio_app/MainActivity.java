package com.janardhan_y.portfolio_app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button movies = (Button) findViewById(R.id.movies);
        movies.setOnClickListener(this);
        Button stock = (Button) findViewById(R.id.stock);
        stock.setOnClickListener(this);
        Button build = (Button) findViewById(R.id.build);
        build.setOnClickListener(this);
        Button material = (Button) findViewById(R.id.material);
        material.setOnClickListener(this);
        Button ubiquitous = (Button) findViewById(R.id.ubiquitous);
        ubiquitous.setOnClickListener(this);
        Button capstone = (Button) findViewById(R.id.capstone);
        capstone.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.movies) {
            Toast.makeText(MainActivity.this, "This Button will launch my Popular Movies app!", Toast.LENGTH_SHORT).show();
        } else if (v.getId() == R.id.stock) {
            Toast.makeText(MainActivity.this, "This Button will launch my Stock Hawk app!", Toast.LENGTH_SHORT).show();
        } else if (v.getId() == R.id.build) {
            Toast.makeText(MainActivity.this, "This Button will launch my Build it Bigger app!", Toast.LENGTH_SHORT).show();
        } else if (v.getId() == R.id.material) {
            Toast.makeText(MainActivity.this, "This Button will launch my Make Your App Material app!", Toast.LENGTH_SHORT).show();
        } else if (v.getId() == R.id.ubiquitous) {
            Toast.makeText(MainActivity.this, "This Button will launch my Go Ubiquitous app!", Toast.LENGTH_SHORT).show();
        } else if (v.getId() == R.id.capstone) {
            Toast.makeText(MainActivity.this, "This Button will launch my Capstone app!", Toast.LENGTH_SHORT).show();
        }

    }
}
