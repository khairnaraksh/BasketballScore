package com.example.mamta.court_counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreteamA = 0;
    int scoreteamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void threepoints(View view) {
        displayForTeamA(scoreteamA = scoreteamA + 3);

    }

    public void twopoint(View view) {
        displayForTeamA(scoreteamA = scoreteamA + 2);

    }

    public void freepoint(View view) {
        displayForTeamA(scoreteamA = scoreteamA + 1);

    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.point_textViewA);
        scoreView.setText(String.valueOf(score));
    }


    public void threepointsB(View view) {
        displayForTeamB(scoreteamB = scoreteamB + 3);
    }

    public void twopointB(View view) {
        displayForTeamB(scoreteamB = scoreteamB + 2);

    }

    public void freepointB(View view) {
        displayForTeamB(scoreteamB = scoreteamB + 1);

    }

    public void displayForTeamB(int score1) {
        TextView scoreView = (TextView) findViewById(R.id.point_textViewB);
        scoreView.setText(String.valueOf(score1));
    }

    public void resetscore(View view) {
        scoreteamA = 0;
        scoreteamB = 0;
        displayForTeamA(scoreteamA);
        displayForTeamB(scoreteamB);
    }
}
