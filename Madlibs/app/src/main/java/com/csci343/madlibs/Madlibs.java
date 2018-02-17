/**********************************************************
 * * Madlibs.java - This java file is the welcome page.
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

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Madlibs extends Activity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_madlibs);
    }


    public void onGetstared(View view) {
        Intent intent = new Intent();
        intent.setClass(this, storyChioce.class);
        startActivity(intent);
    }
}
