package com.example.cakes;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.card.MaterialCardView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MaterialCardView cardView = findViewById(R.id.materialCardView);
        int width = cardView.getWidth();
        cardView.getLayoutParams().height = width;

    }
}
