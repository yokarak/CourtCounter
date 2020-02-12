package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int scoreA=0;
        public int getScoreA() { return scoreA; }
        public void setScoreA(int scoreA) { this.scoreA = scoreA; }
    private int scoreB=0;
        public int getScoreB() { return scoreB; }
        public void setScoreB(int scoreB) { this.scoreB = scoreB; }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB( int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void pointThreeA(View view){ setScoreA(getScoreA()+3); displayForTeamA(scoreA);}
    public void pointTwoA(View view) { setScoreA(getScoreA()+2); displayForTeamA(scoreA);}
    public void freeThrowA(View view) { setScoreA(getScoreA()+1); displayForTeamA(scoreA);}

    public void pointThreeB (View view) { setScoreB(getScoreB()+3); displayForTeamB(scoreB);}
    public void pointTwoB (View view) { setScoreB(getScoreB()+2); displayForTeamB(scoreB);}
    public void freeThrowB(View view) { setScoreB(getScoreB()+1); displayForTeamB(scoreB);}

    public void reset(View view) { setScoreB(0); setScoreA(0); displayForTeamB(scoreB); displayForTeamA(scoreA);}
}
