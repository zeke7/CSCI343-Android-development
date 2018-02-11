/**********************************************************
 * * TipAndTotal.java - This is the main class that sets the contents to the UI.
 * *  *
 * *  * Name: Hao Fang
 * *  * Lab: Lab 2 Tip-o-later
 * *  * Email: hfang@coastal.edu
 * *  * Date: 1/25/2018
 * *  **********************************************************/

package com.csci343.lab02;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class TipAndTotal extends Activity {
    private CalculateTotal toCalbill = new CalculateTotal();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip_and_total);
    }


    public void onClickFindTotal(View view) {

        //Get result text field
        TextView TextResult = (TextView) findViewById(R.id.displayTotal);

        //Get tip text field
        TextView TipResult = (TextView) findViewById(R.id.tips);

        //Get the service level
        Spinner opt = (Spinner) findViewById(R.id.Services);
        String option = String.valueOf(opt.getSelectedItem());

        //Get the bill
        EditText bill = (EditText) findViewById(R.id.bill_info);
        double originalBill = 0;
        String billnum = bill.getText().toString();
        if("".equals(billnum)){
            originalBill = 0;
        }
        else {
            originalBill = Double.valueOf(billnum);
        }

        //Get the tips

        double tips = toCalbill.getTip(originalBill,option);
        String tipresult = String.valueOf(tips);

        TipResult.setText("Your Tips: " + tipresult + " $");

        //Get the final result
        double billResult = toCalbill.getTotalBill(originalBill,option);
        String result = String.valueOf(billResult);

        TextResult.setText("Your Total Bill: " + result + " $");





    }
}
