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
public class OutdoorsFragment extends Fragment {


    public OutdoorsFragment() {
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
        attractions.add(new Attraction(R.string.Creve_Coeur_Park_name, R.string.Creve_Coeur_Park_description,R.drawable.creve_coeur_park_image,R.string.Creve_Coeur_Park_website,
                R.string.Creve_Coeur_Park_Street, R.string.Creve_Coeur_Park_City_State_Zip, R.string.Creve_Coeur_Park_Phone));
        attractions.add(new Attraction(R.string.Go_Ape_name, R.string.Go_Ape_description,R.drawable.go_ape_image,R.string.Go_Ape_website,
                R.string.Go_Ape_Street, R.string.Go_Ape_City_State_Zip, R.string.Go_Ape_Phone));
        attractions.add(new Attraction(R.string.The_Quarry_name, R.string.The_Quarry_description,R.drawable.the_quarry_image,R.string.The_Quarry_website,
                R.string.The_Quarry_Street, R.string.The_Quarry_City_State_Zip, R.string.The_Quarry_Phone));
        attractions.add(new Attraction(R.string.Vago_Park_name, R.string.Vago_Park_description,R.drawable.vago_park,R.string.Vago_Park_website,
                R.string.Vago_Park_Street, R.string.Vago_Park_City_State_Zip, R.string.Vago_Park_Phone));
        attractions.add(new Attraction(R.string.Aquaport_name, R.string.Aquaport_description,R.drawable.aquaport_image,R.string.Aquaport_website,
                R.string.Aquaport_Street, R.string.Aquaport_City_State_Zip, R.string.Aquaport_Phone));
        attractions.add(new Attraction(R.string.Dogport_name, R.string.Dogport_description,R.drawable.dogport_image,R.string.Dogport_website,
                R.string.Dogport_Street, R.string.Dogport_City_State_Zip, R.string.Dogport_Phone));


        AttractionsAdapter adapter = new AttractionsAdapter(getActivity(), attractions);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
