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
public class IndoorsFragment extends Fragment {


    public IndoorsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View rootView = inflater.inflate(R.layout.list, container, false);

        /** public Attraction (int attractionName, int attractionDescription, int attractionImage, int attractionWebSite,
         *  int attractionStreet,int attractionCityStateZip, int attractionGPSLat, int attractionGPSLong, int attractionPhone)
         */
        final ArrayList<Attraction> attractions = new ArrayList<>();
        attractions.add(new Attraction(R.string.Upper_Limits_name,R.string.Upper_Limits_description, R.drawable.upper_limits_image,
                R.string.Upper_Limits_website,R.string.Upper_Limits_Street,R.string.Upper_Limits_City_State_Zip, R.string.Upper_Limits_Phone));
        attractions.add(new Attraction(R.string.Playhouse_name,R.string.Playhouse_description, R.drawable.playhouse_image,
                R.string.Playhouse_website,R.string.Playhouse_Street,R.string.Playhouse_City_State_Zip, R.string.Playhouse_Phone));
        attractions.add(new Attraction(R.string.Escape_Challenge_name,R.string.Escape_Challenge_description, R.drawable.escape_challenge_image,
                R.string.Escape_Challenge_website,R.string.Escape_Challenge_Street,R.string.Escape_Challenge_City_State_Zip, R.string.Escape_Challenge_Phone));
        attractions.add(new Attraction(R.string.Dave_and_Busters_name,R.string.Dave_and_Busters_description, R.drawable.dave_and_busters_image,
                R.string.Dave_and_Busters_website,R.string.Dave_and_Busters_Street,R.string.Dave_and_Busters_City_State_Zip, R.string.Dave_and_Busters_Phone));
        attractions.add(new Attraction(R.string.Hollywood_Amphitheatre_name,R.string.Hollywood_Amphitheatre_description, R.drawable.hollywood_amphitheatre_image,
                R.string.Hollywood_Amphitheatre_website,R.string.Hollywood_Amphitheatre_Street,R.string.Hollywood_Amphitheatre_City_State_Zip, R.string.Playhouse_Phone));


        AttractionsAdapter adapter = new AttractionsAdapter(getActivity(), attractions);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
