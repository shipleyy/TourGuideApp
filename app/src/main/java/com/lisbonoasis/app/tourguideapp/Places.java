package com.lisbonoasis.app.tourguideapp;

/**
 * Created by simon on 22/05/2017.
 */

public class Places {

    private final String mPlaceName;

    private final String mPlaceHours;

    private final String mPlaceType;

    private final int mPlaceImgId;

    public Places(String placeName, String placeHours, String placeType, int placeImgId) {
        mPlaceName = placeName;
        mPlaceHours = placeHours;
        mPlaceType = placeType;
        mPlaceImgId = placeImgId;
    }

    public String getPlaceName() {return mPlaceName;}

    public String getPlaceHours() {return mPlaceHours;}

    public String getPlaceType() {return mPlaceType;}

    public int getPlaceImgId() {return mPlaceImgId;}
}
