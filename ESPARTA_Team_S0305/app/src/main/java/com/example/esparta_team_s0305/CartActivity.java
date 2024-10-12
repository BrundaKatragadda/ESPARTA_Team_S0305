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

public class CartActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        Button proceedToCheckoutButton = findViewById(R.id.checkoutButton);
        proceedToCheckoutButton.setOnClickListener(view -> {
            Intent intent = new Intent(CartActivity.this, PurchaseActivity.class);
            startActivity(intent);
        });
    }
}
