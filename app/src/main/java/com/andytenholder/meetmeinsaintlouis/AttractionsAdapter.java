package com.andytenholder.meetmeinsaintlouis;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AttractionsAdapter extends ArrayAdapter<Attraction>
{

    public AttractionsAdapter(Context context, ArrayList<Attraction> attractions)
    {
        super(context, 0, attractions);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        if(convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Attraction currentAttraction = getItem(position);

        int attractionName = currentAttraction.getAttractionName();
        TextView attractionNameTextView = (TextView) convertView.findViewById(R.id.attraction_name);
        attractionNameTextView.setText(attractionName);

        int attractionDescription = currentAttraction.getAttractionDescription();
        TextView attractionDescriptionTextView = (TextView) convertView.findViewById(R.id.attraction_description);
        attractionDescriptionTextView.setText(attractionDescription);

        int attractionWebsite = currentAttraction.getAttractionWebSite();
        TextView attractionWebsiteTextView = (TextView) convertView.findViewById(R.id.attraction_website);
        attractionWebsiteTextView.setText(attractionWebsite);

        int attractionAddressStreet = currentAttraction.getAttractionStreet();
        TextView attractionAddressStreetTextView = (TextView) convertView.findViewById(R.id.attraction_address_street);
        attractionAddressStreetTextView.setText(attractionAddressStreet);

        int attractionAddressCityStateZip = (currentAttraction.getAttractionCityStateZip());
        TextView attractionAddressCityStateTextView = (TextView) convertView.findViewById(R.id.attraction_address_city);
        attractionAddressCityStateTextView.setText(attractionAddressCityStateZip);

        int attractionPhoneNumberString = (currentAttraction.getAttractionPhone());
        TextView attractionPhoneNumberTextView = (TextView) convertView.findViewById(R.id.attraction_phone_number);
        attractionPhoneNumberTextView.setText(attractionPhoneNumberString);

        ImageView imageView = (ImageView) convertView.findViewById(R.id.imagebox);
        imageView.setImageResource(currentAttraction.getAttractionImage());


        return convertView;
    }

}
