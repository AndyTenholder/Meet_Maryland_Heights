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
public class NightlifeFragment extends Fragment {


    public NightlifeFragment() {
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
        attractions.add(new Attraction(R.string.Funny_Bone_name,R.string.Funny_Bone_description, R.drawable.the_funny_bone_image,
                R.string.Funny_Bone_website,R.string.Funny_Bone_Street,R.string.Funny_Bone_City_State_Zip,R.string.Funny_Bone_Phone));

        attractions.add(new Attraction(R.string.The_Jive_and_Wail_name,R.string.The_Jive_and_Wail_description, R.drawable.jive_and_wail_image,
                R.string.The_Jive_and_Wail_website,R.string.The_Jive_and_Wail_Street,R.string.The_Jive_and_Wail_City_State_Zip,R.string.The_Jive_and_Wail_Phone));

        attractions.add(new Attraction(R.string.Hollywood_Casino_name,R.string.Hollywood_Casino_description, R.drawable.hollywood_casino_image,
                R.string.Hollywood_Casino_website,R.string.Hollywood_Casino_Street,R.string.Hollywood_Casino_City_State_Zip,R.string.Hollywood_Casino_Phone));

        attractions.add(new Attraction(R.string.Back_Street_Jazz_name,R.string.Back_Street_Jazz_description, R.drawable.backstreet_jazz_image,
                R.string.Back_Street_Jazz_website,R.string.Back_Street_Jazz_Street,R.string.Back_Street_Jazz_City_State_Zip,R.string.Back_Street_Jazz_Phone));

        attractions.add(new Attraction(R.string.Bradfords_Pub_name,R.string.Bradfords_Pub_description, R.drawable.bradfords_pub_image,
                R.string.Bradfords_Pub_website,R.string.Bradfords_Pub_Street,R.string.Bradfords_Pub_City_State_Zip,R.string.Bradfords_Pub_Phone));


        AttractionsAdapter adapter = new AttractionsAdapter(getActivity(), attractions);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
