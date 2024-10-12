package com.example.esparta_team_s0305;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ArtworkDetailActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artwork_detail);

        Button addToCartButton = findViewById(R.id.addToCartButton);
        addToCartButton.setOnClickListener(view -> {
            Intent intent = new Intent(ArtworkDetailActivity.this, CartActivity.class);
            startActivity(intent);
        });
    }
}

