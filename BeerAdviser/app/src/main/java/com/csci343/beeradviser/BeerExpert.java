package com.csci343.beeradviser;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by H on 2018/1/24.
 */

public class BeerExpert {

    List<String> getBrands(String color) {
        List<String> brands = new ArrayList<>();
        if (color.equals("amber")) {
            brands.add("Jack Amber");
            brands.add("Red Moose");
        }else{
            brands.add("Jail Pale Ale");
            brands.add("Gout Stout");
        }

        return brands;
    }

}
