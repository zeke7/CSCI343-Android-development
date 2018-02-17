/**********************************************************
 * * storyChioce.java - This java file is to get different choice from user.
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
import android.widget.RadioGroup;

public class storyChioce extends Activity {

    private String storySelected;
    private final String SIMPLE = "madlib0_simple";
    private final String TARZAN = "madlib1_tarzan";
    private final String UNIVER = "madlib2_university";
    private final String CLOTHES = "madlib3_clothes";
    private final String DANCE = "madlib4_dance";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story_chioce);
    }

    @Override
    protected void onStart() {
        super.onStart();
        story_select();
    }

    public void story_select(){
        RadioGroup styGroup = (RadioGroup)findViewById(R.id.story_group);
        styGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.s_simple:
                        storySelected = SIMPLE;
                        break;
                    case R.id.s_tarzan:
                        storySelected = TARZAN;
                        break;
                    case R.id.s_university:
                        storySelected = UNIVER;
                        break;
                    case R.id.s_clothes:
                        storySelected = CLOTHES;
                        break;
                    case R.id.s_dance:
                        storySelected = DANCE;
                        break;
                    default:
                        storySelected = "";
                }
            }
        });
    }

    public void onSelected(View view){
        Intent storySent = new Intent(this,fillwords.class);
        storySent.putExtra("sentStory", storySelected);
        startActivity(storySent);
    }

}
