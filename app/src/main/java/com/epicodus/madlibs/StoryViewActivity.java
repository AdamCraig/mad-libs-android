package com.epicodus.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class StoryViewActivity extends AppCompatActivity {

    private TextView mStoryTextView;
    private Button mPlayAgainButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story_view);
        mStoryTextView = (TextView) findViewById(R.id.storyTextView);
        Intent intent = getIntent();
        String noun1 = intent.getStringExtra("noun1");
        String verb1 = intent.getStringExtra("verb1");
        String adjective1 = intent.getStringExtra("adjective1");
        String properNoun1 = intent.getStringExtra("properNoun1");
        String animal1 = intent.getStringExtra("animal1");
        String verb2 = intent.getStringExtra("verb2");
        mStoryTextView.setText("A long, long time ago, in the Kingdom of " + noun1 + ", there lived a stupid giant. His only desire in the world was to " + verb1 + " as many people as possible. These people must be " + adjective1 + " or he would refuse to " + verb1 + " them. Suddenly, a magnificent hero named " + properNoun1 + " appeared! He was accompanied by his miniature " + animal1 + ", Bub. " + properNoun1 + " and Bub made sure that the stupid giant never " + verb1 + " or " + verb2 + " again.");

        mPlayAgainButton = (Button) findViewById(R.id.playAgainButton);
            mPlayAgainButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent (StoryViewActivity.this, MainActivity.class);
                    startActivity(intent);
                }
            });
    }
}
