package com.example.counterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    int teamACounter =0;
    int teamBCounter =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }
    public void add3pointsTeamA(View view)
    {
        teamACounter +=3;
        displayTeamACounter(teamACounter);

    }
    public void add2pointsTeamA(View view)
    {
        teamACounter +=2;
        displayTeamACounter(teamACounter);

    }
    public void add1pointsTeamA(View view)
    {
        teamACounter +=1;
        displayTeamACounter(teamACounter);

    }
    public void add3pointsTeamB(View view)
    {
        teamBCounter +=3;
        displayTeamBCounter(teamBCounter);

    }
    public void add2pointsTeamB(View view)
    {
        teamBCounter +=2;
        displayTeamBCounter(teamBCounter);

    }
    public void add1pointsTeamB(View view)
    {
        teamBCounter +=1;
        displayTeamBCounter(teamBCounter);

    }

    public void restBtnAction(View view)
    {
        teamBCounter=0;
        teamACounter=0;
        displayTeamACounter(teamACounter);
        displayTeamBCounter(teamBCounter);
    }


    public void displayTeamACounter(int i)
    {
        TextView teamACounter = findViewById(R.id.teamACounter);
        teamACounter.setText(String.valueOf(i));
    }
    public void displayTeamBCounter(int i)
    {
        TextView teamBCounter = findViewById(R.id.teamBCounter);
        teamBCounter.setText(String.valueOf(i));
    }

}
