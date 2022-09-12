package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textViewButton;
    private TextView textViewAbove;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.textViewButton = findViewById(R.id.textViewButton);
        this.textViewAbove = findViewById(R.id.textViewAbove);
    }

    public void Click(View view) {
        textViewButton.setVisibility((textViewButton.getVisibility() == View.VISIBLE)
                ? View.GONE : View.VISIBLE);
        textViewButton.setTextColor(Color.BLUE);

        textViewAbove.setVisibility((textViewAbove.getVisibility() == View.VISIBLE)
                ? View.GONE : View.VISIBLE);
        textViewAbove.setTextColor(Color.RED);

    }
}