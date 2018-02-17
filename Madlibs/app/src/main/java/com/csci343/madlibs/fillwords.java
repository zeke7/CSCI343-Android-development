/**********************************************************
 * * fillwords.java - This jave file is to get the word from user input.
 * *  *
 * *  * Name: Hao Fang
 * *  * Assignment 2: Mad libs
 * *  * Email: hfang@coastal.edu
 * *  * Date: 2/16/2018
 * *  **********************************************************/
package com.csci343.madlibs;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.io.InputStream;

public class fillwords extends Activity {

    private MadLibStory madstory;
    private TextView wordleft;
    private TextView typeofword;
    private final String STORY_NAME = "sentStory";
    private String storysent;
    private int PlaceholderRemaining;
    private String PlaceholderType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fillwords);
        Intent intent = getIntent();
        String storyname = intent.getStringExtra(STORY_NAME);
        storysent = storyname;
        System.out.println(storysent);
    }

    @Override
    protected void onStart() {
        super.onStart();
        try {
            InputStream story = getAssets().open(storysent+".txt");
            madstory = new MadLibStory(story);

        }catch (IOException e){
            System.out.print(e);
        }
    }

    @Override
    protected void onResume() {
        super.onResume();

        if (!madstory.isFilledIn()) {
            PlaceholderRemaining = madstory.getPlaceholderRemainingCount();
            PlaceholderType = madstory.getNextPlaceholder();

            wordleft = (TextView) findViewById(R.id.words_left);
            typeofword = (TextView) findViewById(R.id.word_suggestion);

            wordleft.setText(PlaceholderRemaining + " word(s) left");
            typeofword.setText("please type a/an " + PlaceholderType);
            Toast.makeText(this, "Great! Keep going!", Toast.LENGTH_SHORT).show();
        }
        //if (madstory.isFilledIn()){
          else{
            Intent finalStory = new Intent(this, finalstory.class);
            String storytext = madstory.toString();
            finalStory.putExtra("storyfinal", storytext);
            startActivity(finalStory);
        }

    }

    public void onClickFill(View view){

        EditText word = (EditText) findViewById(R.id.word_text);

        String wordFillin = word.getText().toString();

        madstory.fillInPlaceholder(wordFillin);

        onResume();

    }

}
