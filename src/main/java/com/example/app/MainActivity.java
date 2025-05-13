package com.example.app;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Verknüpfe Buttons mit XML-IDs
        Button startTierRallyeButton = findViewById(R.id.start_tier_rallye_button);
        Button quizButton = findViewById(R.id.quiz_button);
        Button abzeichenButton = findViewById(R.id.abzeichen_button);
        Button einstellungenButton = findViewById(R.id.einstellungen_button);
        Button karteButton = findViewById(R.id.karte_button);

        // OnClick-Listener für Start Tier-Rallye Button
        startTierRallyeButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, StartTierRallyeActivity.class);
            startActivity(intent);
        });

        // OnClick-Listener für Quiz Button
        quizButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, QuizActivity.class);
            startActivity(intent);
        });

        // OnClick-Listener für Abzeichen Button
        abzeichenButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, AbzeichenActivity.class);
            startActivity(intent);
        });

        // OnClick-Listener für Einstellungen Button
        einstellungenButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, EinstellungenActivity.class);
            startActivity(intent);
        });

        // OnClick-Listener für Karte Button
        karteButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, KarteActivity.class);
            startActivity(intent);
        });
    }
}


