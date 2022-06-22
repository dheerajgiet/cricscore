package com.example.cricscore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    private int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void displayForTeamA(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void OneRun(View view) {
        scoreTeamA =scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    public void TwoRun(View view) {
        scoreTeamA =scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    public void threeRun(View view) {
        scoreTeamA =scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    public void FourRun(View view) {
        scoreTeamA =scoreTeamA + 4;
        displayForTeamA(scoreTeamA);
    }

    public void SixRun(View view) {
        scoreTeamA =scoreTeamA + 6;
        displayForTeamA(scoreTeamA);
    }
    public void displayForTeamB(int score){
        this.score = score;
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void OneRub(View view) {
        scoreTeamB =scoreTeamB + 1;
        displayForTeamA(scoreTeamB);
    }

    public void TwoRub(View view) {
        scoreTeamA =scoreTeamA + 2;
        displayForTeamA(scoreTeamB);
    }

    public void threeRub(View view) {
        scoreTeamA =scoreTeamA + 3;
        displayForTeamA(scoreTeamB);
    }

    public void FourRub(View view) {
        scoreTeamA =scoreTeamA + 4;
        displayForTeamA(scoreTeamB);
    }

    public void SixRub(View view) {
        scoreTeamA =scoreTeamA + 8;
        displayForTeamA(scoreTeamB);
    }
}