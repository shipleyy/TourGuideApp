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
public class DaytripFragment extends Fragment {


    public DaytripFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);


        // Sights ArrayList
        final ArrayList<Place> daytrips = new ArrayList<>();

        // Populating the ArrayList
        daytrips.add(new Place(getString(R.string.sintra), getString(R.string.sintra_hours), getString(R.string.type_historical), R.drawable.wiki_sintra_btn));
        daytrips.add(new Place(getString(R.string.cascais), getString(R.string.cascais_hours), getString(R.string.type_beach), R.drawable.wiki_cascais_btn));
        daytrips.add(new Place(getString(R.string.costa), getString(R.string.costa_hours), getString(R.string.type_beach), R.drawable.wiki_cascais_btn));
        daytrips.add(new Place(getString(R.string.mafra), getString(R.string.mafra_hours), getString(R.string.type_historical), R.drawable.wiki_lisbon_btn));


        // setting up the adapter
        final PlacesAdapter placesAdapter = new PlacesAdapter(getActivity(), daytrips);

        // Declaring the ListView
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        assert listView != null;

        listView.setAdapter(placesAdapter);

        return rootView;
    }

}
