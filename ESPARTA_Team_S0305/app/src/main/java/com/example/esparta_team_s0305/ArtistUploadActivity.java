package com.example.esparta_team_s0305;

import android.content.Intent;

import android.graphics.Bitmap;

import android.net.Uri;

import android.os.Bundle;

import android.provider.MediaStore;

import android.view.View;

import android.widget.Button;

import android.widget.EditText;

import android.widget.ImageView;

import android.widget.Toast;

import androidx.annotation.Nullable;

import androidx.appcompat.app.AppCompatActivity;

public class ArtistUploadActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist_upload); // Make sure this points to the correct layout

        // Initialize the viewDetailsButton from the XML layout
        Button viewDetailsButton = findViewById(R.id.viewDetailsButton);

        // Set an OnClickListener to navigate to ArtworkDetailActivity
        viewDetailsButton.setOnClickListener(view -> {
            Intent intent = new Intent(ArtistUploadActivity.this, ArtworkDetailActivity.class);
            startActivity(intent);
        });
    }
}
