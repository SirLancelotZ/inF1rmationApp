package com.example.buttonclicker;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView textViewScore;
    private int score;
    private int textsize;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewScore = findViewById(R.id.textView_main_score);
        score = 0;
        textsize = 8;


    }

    // matches the name of the method in the button's
    // onClick attribute in the xml layout
    public void onClickMeClick(View view) {
        // update score
        score++;
        textsize=textsize+1;
        // update the textView displaying the score
        textViewScore.setText("Score: " + score);
        textViewScore.setTextSize(textsize);
        if(score == 20){
            Toast.makeText(this, "Hooray!", Toast.LENGTH_SHORT).show();
        }
    }


}
