package com.Part2.my;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class basketball extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basketball);

        displayforTeamA(0);
        displayforTeamB(0);


    }

    // T e a m ...A...S C O R E

    public void displayforTeamA(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }


    public void gainthree(View view){
        scoreTeamA = scoreTeamA + 3;
        displayforTeamA(scoreTeamA);

    }


    public void gaintwo(View view){
        scoreTeamA = scoreTeamA + 2;
        displayforTeamA(scoreTeamA);


    }

    public void gainone(View view){
        scoreTeamA = scoreTeamA + 1;
        displayforTeamA(scoreTeamA);


    }


    // T e a m ... B  ...S C O R E

    public void displayforTeamB(int score){
        TextView scoreView = (TextView) findViewById(R.id.scoreOfTeamB);
        scoreView.setText(String.valueOf(score));
    }


    public void gainthreeb(View view){
        scoreTeamB = scoreTeamB + 3;
        displayforTeamB(scoreTeamB);

    }


    public void gaintwob(View view){
        scoreTeamB = scoreTeamB + 2;
        displayforTeamB(scoreTeamB);


    }

    public void gainoneb(View view){
        scoreTeamB = scoreTeamB + 1;
        displayforTeamB(scoreTeamB);


    }

    /// RESET
    public void reset(View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayforTeamB(scoreTeamA);
        displayforTeamA(scoreTeamB);
    }



}
