package com.example.mamta.court_counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreteamA=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void threepoints(View view) {
        displayForTeamA(scoreteamA=scoreteamA+3);

    }

    public void twopoint(View view) {
        displayForTeamA(scoreteamA=scoreteamA+2);

    }

    public void freepoint(View view) {
        displayForTeamA(scoreteamA=scoreteamA+1);

    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.point_textView);
        scoreView.setText(String.valueOf(score));
    }
}
