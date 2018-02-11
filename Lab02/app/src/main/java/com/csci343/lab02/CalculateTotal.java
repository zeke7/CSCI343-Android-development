/**********************************************************
 * * Calculate.java - This class is to get the tips and total bill.
 * *  *
 * *  * Name: Hao Fang
 * *  * Lab: Lab 2 Tip-o-later
 * *  * Email: hfang@coastal.edu
 * *  * Date: 1/25/2018
 * *  **********************************************************/
package com.csci343.lab02;

import java.math.RoundingMode;
import java.text.NumberFormat;

public class CalculateTotal {
    double getTotalBill(double bill, String serLevel){
        //Poor – would receive 5% of the Bill as a Tip
        double total = 0;
        if ("Poor".equals(serLevel)){
            total = bill + bill*0.05;
        }
        //Good – would receive 10% of the Bill as a Tip
        if ("Good".equals(serLevel)){
            total = bill + bill*0.1;
        }
        //Excellent – would receive 20% of the Bill as a Tip
        if ("Excellent".equals(serLevel)){
            total = bill + bill*0.2;
        }
        NumberFormat nf = NumberFormat.getNumberInstance();
        nf.setMaximumFractionDigits(3);
        nf.setRoundingMode(RoundingMode.DOWN);
        total = Double.valueOf(nf.format(total));

        return total;
    }

    double getTip(double bill, String serLevel){
        //Poor – would receive 5% of the Bill as a Tip
        double total = 0;
        if ("Poor".equals(serLevel)){
            total = bill*0.05;
        }
        //Good – would receive 10% of the Bill as a Tip
        if ("Good".equals(serLevel)){
            total = bill*0.1;
        }
        //Excellent – would receive 20% of the Bill as a Tip
        if ("Excellent".equals(serLevel)){
            total = bill*0.2;
        }
        NumberFormat nf = NumberFormat.getNumberInstance();
        nf.setMaximumFractionDigits(3);
        nf.setRoundingMode(RoundingMode.DOWN);
        total = Double.valueOf(nf.format(total));

        return total;
    }


}
