/**********************************************************
 * * findTeam.java - This class is to determine which team it is from ChampionshiAcitivity and return the team infomation.
 * *  *
 * *  * Name: Hao Fang
 * *  * Lab: Lab 4 NFL Activities
 * *  * Email: hfang@coastal.edu
 * *  * Date: 2/8/2018
 * *  **********************************************************/
package com.csci343.nflchampionship;

import android.widget.ImageView;



public class findTeam {

    String getInfomation(String name,ImageView view1,ImageView view2){
        String result = "";
        if ("Jacksonville Jaguars".equals(name)){
            result = "Jacksonville Jaguars(AFC)\n Lost in the match against New England Patriots";
            view1.setImageResource(R.drawable.j_jaguars);
            view2.setImageResource(R.drawable.nj);
        }else if ("New England Patriots".equals(name)){
            result = "New England Patriots(AFC)\n The Championship of AFC(Beat Jacksonville Jaguars)\n " +
                    "Lost SuperBowl against Philadelphia Eagles";
            view1.setImageResource(R.drawable.n_england);
            view2.setImageResource(R.drawable.superbowl);
        }else if ("Minnesota Vikings".equals(name)){
            result = "Minnesota Vikings(NFC)\n Lost in the match against Philadelphia Eagles";
            view1.setImageResource(R.drawable.m_vikings);
            view2.setImageResource(R.drawable.en);
        }else if ("Philadelphia Eagles".equals(name)){
            result = "Philadelphia Eagles(NFC)\n The Championship of NFC(Beat Minnesota Vikings)," +
                    "\n and won the SuperBowl(Beat New England Patriots)";
            view1.setImageResource(R.drawable.p_eagles);
            view2.setImageResource(R.drawable.superbowl);
        }else {
            result = "The team is not in the list right now!";
        }
        return result;
    }

}
