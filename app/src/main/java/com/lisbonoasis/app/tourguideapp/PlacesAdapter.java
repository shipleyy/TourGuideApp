package com.lisbonoasis.app.tourguideapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by simon on 22/05/2017.
 */

public class PlacesAdapter extends ArrayAdapter<Places> {


    public PlacesAdapter(Activity context, ArrayList<Places> places) {
        super(context, 0, places);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }


        // Get the current item
        final Places currentPlace = getItem(position);

        // Declare and set the place name TextView for the current item
        TextView placeNameTextView = (TextView) listItemView.findViewById(R.id.tv_placeName);
        assert currentPlace != null;
        placeNameTextView.setText(currentPlace.getPlaceName());

        // Declare and set the place opening hours for the current item
        TextView placeHoursTextView = (TextView) listItemView.findViewById(R.id.tv_placeHours);
        placeHoursTextView.setText(currentPlace.getPlaceHours());

        // Declare and set the place type for the current item
        TextView placeTypeTextView = (TextView) listItemView.findViewById(R.id.tv_placeType);
        placeTypeTextView.setText(currentPlace.getPlaceType());

        // Declare and set the place image for the current item
        ImageView placeImageImageView = (ImageView) listItemView.findViewById(R.id.im_placeImg);
        placeImageImageView.setImageResource(currentPlace.getPlaceImgId());

        // return the listview with the new changes
        return listItemView;
    }
}
