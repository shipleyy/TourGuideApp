package com.lisbonoasis.app.tourguideapp.tab_fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.lisbonoasis.app.tourguideapp.Place;
import com.lisbonoasis.app.tourguideapp.PlacesAdapter;
import com.lisbonoasis.app.tourguideapp.R;

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
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);


        // Sights ArrayList
        final ArrayList<Place> restaurants = new ArrayList<>();

        // Populating the ArrayList
        restaurants.add(new Place(getString(R.string.pasteis), getString(R.string.pasteis_hours), getString(R.string.type_italian), R.drawable.lisbon_round));
        restaurants.add(new Place(getString(R.string.belcanto), getString(R.string.belcanto_hours), getString(R.string.type_japanese), R.drawable.lisbon_round));
        restaurants.add(new Place(getString(R.string.comida), getString(R.string.comida_hours), getString(R.string.type_portuguese), R.drawable.lisbon_round));
        restaurants.add(new Place(getString(R.string.alma), getString(R.string.alma_hours), getString(R.string.type_danish), R.drawable.lisbon_round));


        // setting up the adapter
        final PlacesAdapter placesAdapter = new PlacesAdapter(getActivity(), restaurants);

        // Declaring the ListView
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        assert listView != null;

        listView.setAdapter(placesAdapter);

        return rootView;
    }

}
