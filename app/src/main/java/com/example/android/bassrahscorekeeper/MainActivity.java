package com.example.android.bassrahscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int groundCards = 4;

    int cardCount_A = 0;
    int cardCount_B = 0;

    int score_A = 0;
    int score_B = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    //buttons
    public void add_groundCard (View view){
        displayGroundCards(++groundCards);
    }


    public void oneCard_TeamA (View view){
        displayGroundCards(--groundCards);
        displayCardCount_A(++cardCount_A);
    }

    public void oneCard_TeamB (View view){
        displayGroundCards(--groundCards);
        displayCardCount_B(++cardCount_B);
    }

    public void all_TeamA (View view){
        cardCount_A = cardCount_A + groundCards;
        groundCards = 0;
        displayGroundCards(groundCards);
        displayCardCount_A(cardCount_A);
    }
    public void all_TeamB(View view){
        cardCount_B = cardCount_B + groundCards;
        groundCards = 0;
        displayGroundCards(groundCards);
        displayCardCount_B(cardCount_B);
    }

    public void bassrah_TeamA(View view){
      score_A = score_A +10;
        displayScore_A(score_A);
    }
    public void bassrah_TeamB(View view){
        score_B = score_B + 10;
        displayScore_B(score_B);
    }

    public void result (View view){

        if (cardCount_A > cardCount_B){
            score_A = score_A + 30;
        }
    else {
            score_B = score_B + 30;
        }
        displayScore_A(score_A);
        displayScore_B(score_B);
    }
    public void reset (View view){
       groundCards = 4;

        cardCount_A = 0;
        cardCount_B = 0;

        score_A = 0;
        score_B = 0;

        displayGroundCards(groundCards);
        displayCardCount_A(cardCount_A);
        displayCardCount_B(cardCount_B);
        displayScore_A(score_A);
        displayScore_B(score_B);
    }



    // displays
    private void displayGroundCards (int number){
        TextView groundCardsTextView = (TextView) findViewById(R.id.groundCards);
        groundCardsTextView.setText("" + number);

    }


    private void displayCardCount_A (int number){
        TextView CardCountTextView = (TextView) findViewById(R.id.team_a_cardCount);
        CardCountTextView.setText("" + number);

    }

    private void displayCardCount_B (int number){
        TextView CardCountTextView = (TextView) findViewById(R.id.team_b_cardCount);
        CardCountTextView.setText("" + number);

    }

    private void displayScore_A (int number){
        TextView ScoreTextView = (TextView) findViewById(R.id.team_a_score);
        ScoreTextView.setText("" + number);

    }
    private void displayScore_B (int number){
        TextView ScoreTextView = (TextView) findViewById(R.id.team_b_score);
        ScoreTextView.setText("" + number);

    }
}
