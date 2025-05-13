package com.example.app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class ImageSwitchActivity extends AppCompatActivity {

    private ImageView imageView;
    private Button nextButton; // Weiter-Button
    private String[] images = {"quiz1", "quiz2"}; // Bilder für das Bienen-Quiz
    private int currentIndex = 0; // Index für das aktuell angezeigte Bild

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_switch);

        imageView = findViewById(R.id.imageView);
        nextButton = findViewById(R.id.next_button);

        // Erstes Bild anzeigen
        setImage(currentIndex);

        // "Weiter"-Button-Logik
        nextButton.setOnClickListener(v -> {
            currentIndex++;
            if (currentIndex < images.length) {
                setImage(currentIndex);
            } else {
                finish(); // Quiz beenden
            }
        });
    }

    // Methode zum Setzen des Bildes
    private void setImage(int index) {
        int resId = getResources().getIdentifier(images[index], "drawable", getPackageName());
        imageView.setImageResource(resId);
    }
}
