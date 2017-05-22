package com.lisbonoasis.app.tourguideapp.tab_fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.lisbonoasis.app.tourguideapp.Places;
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
        final ArrayList<Places> restaurants = new ArrayList<>();

        // Populating the ArrayList
        restaurants.add(new Places("Pasteis de Belem", "Sun - Sat 09:00 am - 8:00 pm", "Italian", R.drawable.lisbon_round));
        restaurants.add(new Places("Belcanto", "Tue - Sun 11:00 am - 11:00 pm", "Japanese", R.drawable.lisbon_round));
        restaurants.add(new Places("Casa da Comida", "Sun - Sat 11:00 am - 10:00 pm", "Portuguese", R.drawable.lisbon_round));
        restaurants.add(new Places("Restaurante Alma", "Tue - Sun 10:00 am - 11:00 pm", "Danish", R.drawable.lisbon_round));


        // setting up the adapter
        final PlacesAdapter placesAdapter = new PlacesAdapter(getActivity(), restaurants);

        // Declaring the ListView
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        assert listView != null;

        listView.setAdapter(placesAdapter);

        return rootView;
    }

}
