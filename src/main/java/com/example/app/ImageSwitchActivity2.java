package com.example.app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class ImageSwitchActivity2 extends AppCompatActivity {

    private ImageView imageView;
    private Button correctButton; // Richtige Antwort
    private Button incorrectButton; // Falsche Antwort
    private Button nextButton1; // Weiter-Button
    private String[] images = {"quiz3", "quiz4"}; // Bilder für das Waschbär-Quiz
    private int currentIndex = 0; // Index für das aktuell angezeigte Bild

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_switch2);

        imageView = findViewById(R.id.imageView);
        correctButton = findViewById(R.id.button_correct);
        incorrectButton = findViewById(R.id.button_incorrect);
        nextButton1 = findViewById(R.id.next_button);

        // Erstes Bild anzeigen
        setImage(currentIndex);

        // Standardmäßig Buttons für richtige/falsche Antworten ausblenden
        correctButton.setVisibility(View.VISIBLE);
        incorrectButton.setVisibility(View.VISIBLE);

        // "Weiter"-Button-Logik
        nextButton1.setOnClickListener(v -> {
            currentIndex++;
            if (currentIndex < images.length) {
                setImage(currentIndex);

                // Antwort-Buttons für quiz3.png anzeigen
                if ("quiz3".equals(images[currentIndex])) {
                    nextButton1.setVisibility(View.GONE);
                    correctButton.setVisibility(View.VISIBLE);
                    incorrectButton.setVisibility(View.VISIBLE);
                }
            } else {
                finish(); // Quiz beenden
            }
        });

        // Logik für richtige Antwort
        correctButton.setOnClickListener(v -> {
            setImageByName("tierfutterfreigeschaltet"); // Tierfutter anzeigen
            correctButton.setVisibility(View.GONE);
            incorrectButton.setVisibility(View.GONE);
            nextButton1.setVisibility(View.GONE);
        });

        // Logik für falsche Antwort
        incorrectButton.setOnClickListener(v -> {
            setImageByName("quiz4"); // Weiterleitung zu quiz4.png
            correctButton.setVisibility(View.GONE);
            incorrectButton.setVisibility(View.GONE);
            nextButton1.setVisibility(View.VISIBLE);
        });
    }

    // Methode zum Setzen des Bildes
    private void setImage(int index) {
        int resId = getResources().getIdentifier(images[index], "drawable", getPackageName());
        imageView.setImageResource(resId);
    }

    // Methode zum Setzen eines spezifischen Bildes nach Name
    private void setImageByName(String imageName) {
        int resId = getResources().getIdentifier(imageName, "drawable", getPackageName());
        imageView.setImageResource(resId);
    }
}
