package com.example.esparta_team_s0305;

import android.content.Intent;

import android.os.Bundle;

import android.view.View;

import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button uploadButton = findViewById(R.id.uploadButton);
        uploadButton.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, ArtistUploadActivity.class);
            startActivity(intent);
        });
    }
}
