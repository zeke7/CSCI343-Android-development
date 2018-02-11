package com.csci343.beeradviser;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.List;

public class FindBeerActivity extends Activity {

    private BeerExpert expert = new BeerExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);
    }

    public void onClickFindBeer(View view) {
        // Get a reference to the TextView
        TextView brands = (TextView) findViewById(R.id.brands);

        //Get a reference to the Spinner
        Spinner color = (Spinner) findViewById(R.id.color);

        //Get the selected item in the Spinner
        String beerType = String.valueOf(color.getSelectedItem());

        //Display the selected item
        //brands.setText(beerType);

        //Get recommendation from the BeerExpert class
        List<String> result = expert.getBrands(beerType);
        StringBuilder brandFormatted = new StringBuilder();

        for (String brand: result){
            brandFormatted.append(brand+"\n");
        }

        brands.setText(brandFormatted);
    }
}
