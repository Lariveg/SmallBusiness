package com.example.android.smallbusiness;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView titleText = (TextView)findViewById(R.id.title);
        Typeface title_font = Typeface.createFromAsset(getAssets(),  "fonts/RubikMonoOne-Regular.ttf");
        titleText.setTypeface(title_font);

        TextView sloganText = (TextView)findViewById(R.id.slogan);
        Typeface slogan_font = Typeface.createFromAsset(getAssets(),  "fonts/Lobster-Regular.ttf");
        sloganText.setTypeface(slogan_font);
    }

}

