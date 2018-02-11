/**********************************************************
 * Lab01.java - This is the my first Android App   *
 *                                                 *
 * Name: Hao Fang                                  *
 * Lab: Lab 1 Getting Started                      *
 * Email: hfang@coastal.edu                        *
 * Date: 1/18/2017                                 *
 **********************************************************/
package com.csci343.myfirstapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonTap(View v) {
        Toast myToast = Toast.makeText(getApplicationContext(), "Ouch!", Toast.LENGTH_LONG);
        myToast.show();
    }

}
