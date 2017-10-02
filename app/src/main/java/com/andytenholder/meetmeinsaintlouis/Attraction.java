package com.andytenholder.meetmeinsaintlouis;

/**
 * Created by Andy Tenholder on 12/13/2016.
 */

public class Attraction {



    // Name
    private int mAttractionName;
    public int getAttractionName() {return mAttractionName;}

    // Website
    private int mAttractionWebSite;
    public int getAttractionWebSite() {return mAttractionWebSite;}

    // Location
    private int mAttractionStreet;
    public int getAttractionStreet() {return mAttractionStreet;}

    private int mAttractionCityStateZip;
    public int getAttractionCityStateZip() {return mAttractionCityStateZip;}


    // Short Description
    private int mAttractionDescription;
    public int getAttractionDescription() {return mAttractionDescription;}

    // Phone Number
    private int mAttractionPhone;
    public int getAttractionPhone() {return mAttractionPhone;}

    // Image
    private int mAttractionImage;
    public int getAttractionImage() {return mAttractionImage;}



    public Attraction (int attractionName, int attractionDescription, int attractionImage, int attractionWebSite,
                       int attractionStreet,int attractionCityStateZip, int attractionPhone)
    {
        mAttractionName = attractionName;
        mAttractionDescription = attractionDescription;
        mAttractionImage = attractionImage;
        mAttractionWebSite = attractionWebSite;
        mAttractionStreet = attractionStreet;
        mAttractionCityStateZip = attractionCityStateZip;
        mAttractionPhone = attractionPhone;
    }

}
