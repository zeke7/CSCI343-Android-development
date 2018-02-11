/**********************************************************
 * * InfoActivity.java - This class is to get the team name from ChampionshiAcitivity and return the team infomation.
 * *  *
 * *  * Name: Hao Fang
 * *  * Lab: Lab 4 NFL Activities
 * *  * Email: hfang@coastal.edu
 * *  * Date: 2/4/2018
 * *  **********************************************************/
package com.csci343.nflchampionship;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class InfoActivity extends Activity {
    public static final String EXTRA_MESSAGE = "message";
    private findTeam teamInfo = new findTeam();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        ImageView view1 = (ImageView) findViewById(R.id.nflteam_iamge);
        ImageView view2 = (ImageView) findViewById(R.id.nflteam_info);
        Intent intent = getIntent();
        //Get team name
        String teamName = intent.getStringExtra(EXTRA_MESSAGE);
        //Get the team infomation
        String team = teamInfo.getInfomation(teamName, view1, view2);
        //Set the text field
        TextView messageView = (TextView) findViewById(R.id.message_info);
        messageView.setText(team);
    }
}
