package com.example.testscore;

import static com.example.testscore.R.id.button3A;
import static com.example.testscore.R.id.team_a_score;
import static com.example.testscore.R.id.team_b_score;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {
Button button3A,button2,button3,button4,button5,button6,button7;
int score,score1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         displayforTeamA(score);
         displayforTeamB(score);
        button3A=(Button)findViewById(R.id.button3A);
        button3A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                displayforTeamA( score+3);
                 score=score+3;

            }
        });
        button2=(Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                displayforTeamA(score+2);
                 score=score+2;

            }
        });
        button3=(Button)findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                displayforTeamA(score+1);
                score=score+1;

            }
        });

        button4=(Button)findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                displayforTeamB(score1+3);
                score1=score1+3;

            }
        });
        button5=(Button)findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                displayforTeamB(score1+2);
                score1=score1+2;

            }
        });
        button6=(Button)findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                displayforTeamB(score1+1);
                score1=score1+1;

            }
        });
        button7=(Button)findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayforTeamA(0);
                displayforTeamB(0);

            }
        });

    }
    public void displayforTeamA(int score) {
            TextView scoreView = (TextView) findViewById(R.id.team_a_score);
            scoreView.setText(String.valueOf(score));
        }

    public void displayforTeamB(int score1){
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score1));
    }



}