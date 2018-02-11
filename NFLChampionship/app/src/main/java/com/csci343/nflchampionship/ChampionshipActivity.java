/**********************************************************
 * * ChampionshipActivity.java - This class is to select the team name and sends the team name to InfoActivity.
 * *  *
 * *  * Name: Hao Fang
 * *  * Lab: Lab 4 NFL Activities
 * *  * Email: hfang@coastal.edu
 * *  * Date: 2/8/2018
 * *  **********************************************************/
package com.csci343.nflchampionship;

import android.app.Activity;
import android.content.Intent;
import android.icu.text.IDNA;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;

public class ChampionshipActivity extends Activity {

    private MediaPlayer mp1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_championship);
    }

    @Override
    protected void onResume() {
        super.onResume();
        mp1 = MediaPlayer.create(getApplicationContext(), R.raw.nfl_theme);
        mp1.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mp1.stop();
        mp1 = null;
    }

    public void onClickSearch(View view) {
        //Get Team Name
        Spinner opt = (Spinner) findViewById(R.id.message);
        String option = String.valueOf(opt.getSelectedItem());

        //Send the team name to InfoActivity
        Intent intent = new Intent(this, InfoActivity.class);
        intent.putExtra("message", option);
        startActivity(intent);
    }
}
