package com.example.app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class StartTierRallyeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_tier_rallye);

        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);

        // Button 1: Quiz1 und Quiz2
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StartTierRallyeActivity.this, ImageSwitchActivity.class);
                intent.putExtra("imageArray", new String[]{"quiz1", "quiz2"});
                startActivity(intent);
            }
        });

        // Button 2: Quiz3 und Quiz4
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StartTierRallyeActivity.this, ImageSwitchActivity2.class);
                intent.putExtra("imageArray", new String[]{"quiz3", "quiz4"});
                startActivity(intent);
            }
        });
    }

}
