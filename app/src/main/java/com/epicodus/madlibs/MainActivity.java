package com.epicodus.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button mLibsSubmitButton;
    private EditText mNoun1EditText;
    private EditText mVerb1EditText;
    private EditText mAdjective1EditText;
    private EditText mProperNoun1EditText;
    private EditText mAnimal1EditText;
    private EditText mVerb2EditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mNoun1EditText = (EditText) findViewById(R.id.noun1EditText);
        mVerb1EditText = (EditText) findViewById(R.id.verb1EditText);
        mAdjective1EditText = (EditText) findViewById(R.id.adjective1EditText);
        mProperNoun1EditText = (EditText) findViewById(R.id.properNoun1EditText);
        mAnimal1EditText = (EditText) findViewById(R.id.animal1EditText);
        mVerb2EditText = (EditText) findViewById(R.id.verb2EditText);

        mLibsSubmitButton = (Button) findViewById(R.id.libsSubmitButton);
            mLibsSubmitButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String noun1 = mNoun1EditText.getText().toString();
                    String verb1 = mVerb1EditText.getText().toString();
                    String adjective1 = mAdjective1EditText.getText().toString();
                    String properNoun1 = mProperNoun1EditText.getText().toString();
                    String animal1 = mAnimal1EditText.getText().toString();
                    String verb2 = mVerb2EditText.getText().toString();
                    Intent intent = new Intent(MainActivity.this, StoryViewActivity.class);
                    intent.putExtra("noun1", noun1);
                    intent.putExtra("verb1", verb1);
                    intent.putExtra("adjective1", adjective1);
                    intent.putExtra("properNoun1", properNoun1);
                    intent.putExtra("animal1", animal1);
                    intent.putExtra("verb2", verb2);

                    startActivity(intent);
                }
            });
    }
}
