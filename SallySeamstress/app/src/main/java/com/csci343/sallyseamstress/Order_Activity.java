/**********************************************************
 * * Order_Activity.java - This is the main class that sets the contents to the UI.
 * *  *
 * *  * Name: Hao Fang
 * *  * Homework 1: Dress Maker
 * *  * Email: hfang@coastal.edu
 * *  * Date: 1/31/2018
 * *  **********************************************************/
package com.csci343.sallyseamstress;

import android.app.Activity;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Order_Activity extends Activity {
    private orderTotal orderRes = new orderTotal();

    public int sizeprice = 0;
    public int matprice = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        size_select();
        mat_select();
    }

    public void size_select(){
        RadioGroup sizeGroup = (RadioGroup) findViewById(R.id.size_group);
        sizeGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.small:
                        sizeprice = 0;
                        break;
                    case R.id.middle:
                        sizeprice = 0;
                        break;
                    case R.id.large:
                        sizeprice = 100;
                        break;
                    case R.id.xlarge:
                        sizeprice = 100;
                        break;
                    default:
                        sizeprice = 0;
                        break;
                }
            }
        });
    }

    public void mat_select(){
        RadioGroup matGroup = (RadioGroup) findViewById(R.id.mat_group);
        matGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.Polyester:
                        matprice = 0;
                        break;
                    case R.id.Flanel:
                        matprice = 25;
                        break;
                    case R.id.Cotton:
                        matprice = 50;
                        break;
                    case R.id.Linen:
                        matprice = 75;
                        break;
                    case R.id.Silk:
                        matprice = 150;
                        break;
                    default:
                        matprice = 0;
                        break;
                }
            }
        });
    }

    public void onClickFindTotal(View view) {


        //Get result text field
        TextView TextResult = (TextView) findViewById(R.id.order_total);

        //Get order
        EditText orderNum = (EditText) findViewById(R.id.order);
        double originalOrder = 125;
        String order = orderNum.getText().toString();
        if ("".equals(order)){
            originalOrder = 0;
        }
        else {
            originalOrder = Double.valueOf(order);
        }

        //Get size
        int size = sizeprice;
        //Get material price
        int mat = matprice;

        //Get pockets number
        EditText pocNum = (EditText) findViewById(R.id.pok_number);
        int originalpoc = 0;
        String pockets = pocNum.getText().toString();
        if ("".equals(pockets)){
            originalpoc = 0;
        }
        else {
            originalpoc = Integer.valueOf(pockets) * 30;
        }

        //Get the final result
        double orderResult = orderRes.getOrderTotal(originalOrder,size,mat,originalpoc);

        String result = String.valueOf(orderResult);

        TextResult.setText("You Total Order: " + result + " $");



    }





}
