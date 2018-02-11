/**********************************************************
 * * OrderTotal.java - This is the class that calculate the total order.
 * *  *
 * *  * Name: Hao Fang
 * *  * Homework 1: Dress Maker
 * *  * Email: hfang@coastal.edu
 * *  * Date: 1/31/2018
 * *  **********************************************************/
package com.csci343.sallyseamstress;

import java.math.RoundingMode;
import java.text.NumberFormat;


public class orderTotal {
    public double getOrderTotal(double order, int size, int mat, int pockets){
        double result = order + size + mat + pockets;
        return result;
    }
}
