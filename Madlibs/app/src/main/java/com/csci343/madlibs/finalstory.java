/**********************************************************
 * * finalstory.java - This java file is to set the final story.
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
import android.view.View;
import android.widget.TextView;

public class finalstory extends Activity {
    public static final String FINAL_STORY = "storyfinal";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finalstory);

        Intent intent = getIntent();
        String finalResult = intent.getStringExtra(FINAL_STORY);

        TextView storyView = (TextView)findViewById(R.id.content_story);
        storyView.setText(finalResult);

    }

    public void onAnotherStory(View view){
        Intent intent = new Intent();
        intent.setClass(this, storyChioce.class);
        startActivity(intent);
    }
}
