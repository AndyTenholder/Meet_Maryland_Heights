package com.andytenholder.meetmeinsaintlouis;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantsFragment extends Fragment {


    public RestaurantsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View rootView = inflater.inflate(R.layout.list, container, false);

        /** public Attraction (int attractionName, int attractionDescription, int attractionImage, int attractionWebSite,
         *  int attractionStreet,int attractionCityStateZip, int attractionPhone)
         */
        final ArrayList<Attraction> attractions = new ArrayList<>();
        attractions.add(new Attraction (R.string.Sybergs_Dorsett_name, R.string.Sybergs_Dorsett_description, R.drawable.sybergs_dorestt_image, R.string.Sybergs_Dorsett_website,
                R.string.Sybergs_Dorsett_Street, R.string.Sybergs_Dorsett_City_State_Zip, R.string.Sybergs_Dorsett_Phone));
        attractions.add(new Attraction (R.string.Kobes_Japanese_Steakhouse_name, R.string.Kobes_Japanese_Steakhouse_description, R.drawable.kobes_japanese_steakhouse_image,
                R.string.Kobes_Japanese_Steakhouse_website, R.string.Kobes_Japanese_Steakhouse_Street, R.string.Kobes_Japanese_Steakhouse_City_State_Zip, R.string.Kobes_Japanese_Steakhouse_Phone));
        attractions.add(new Attraction (R.string.Serras_Pizzeria_name, R.string.Serras_Pizzeria_description, R.drawable.serras_pizzeria_image, R.string.Serras_Pizzeria_website,
                R.string.Serras_Pizzeria_Street, R.string.Serras_Pizzeria_City_State_Zip, R.string.Serras_Pizzeria_Phone));
        attractions.add(new Attraction (R.string.OFallon_Brewery_name, R.string.OFallon_Brewery_description, R.drawable.ofallon_brewery_image, R.string.OFallon_Brewery_website,
                R.string.OFallon_Brewery_Street, R.string.OFallon_Brewery_City_State_Zip, R.string.OFallon_Brewery_Phone));
        attractions.add(new Attraction (R.string.Fuzzys_Taco_Shop_name, R.string.Fuzzys_Taco_Shop_description, R.drawable.fuzzys_taco_shop_image, R.string.Fuzzys_Taco_Shop_website,
                R.string.Fuzzys_Taco_Shop_Street, R.string.Fuzzys_Taco_Shop_City_State_Zip, R.string.Fuzzys_Taco_Shop_Phone));
        attractions.add(new Attraction (R.string.Big_Baby_Q_name, R.string.Big_Baby_Q_description, R.drawable.big_baby_q_image, R.string.Big_Baby_Q_website,
                R.string.Big_Baby_Q_Street, R.string.Big_Baby_Q_City_State_Zip, R.string.Big_Baby_Q_Phone));
        attractions.add(new Attraction (R.string.Balduccis_Winefest_Restaurant_name, R.string.Balduccis_Winefest_Restaurant_description, R.drawable.balduccis_restaurant_image, R.string.Balduccis_Winefest_Restaurant_website,
                R.string.Balduccis_Winefest_Restaurant_Street, R.string.Balduccis_Winefest_Restaurant_City_State_Zip, R.string.Balduccis_Winefest_Restaurant_Phone));
        attractions.add(new Attraction (R.string.Standard_Brewing_Company_name, R.string.Standard_Brewing_Company_description, R.drawable.standard_brewing_company_image, R.string.Standard_Brewing_Company_website,
                R.string.Standard_Brewing_Company_Street, R.string.Standard_Brewing_Company_City_State_Zip, R.string.Standard_Brewing_Company_Phone));


        AttractionsAdapter adapter = new AttractionsAdapter(getActivity(), attractions);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
