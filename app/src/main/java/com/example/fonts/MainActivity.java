package com.example.fonts;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView hindi , urdu , english ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        hindi = findViewById(R.id.tvhindi);
        urdu = findViewById(R.id.tvurdu);
        english = findViewById(R.id.tveng);
        Typeface hindiFont = Typeface.createFromAsset(getAssets() , "fonts/hindi.TTF");
        hindi.setTypeface(hindiFont);
        Typeface urduFont = Typeface.createFromAsset(getAssets() , "fonts/urdu.ttf");
        urdu.setTypeface(urduFont);
        Typeface englishFont = Typeface.createFromAsset(getAssets() , "fonts/eng.ttf");
        english.setTypeface(englishFont);



    }
}