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

public class SightsFragment extends Fragment {

    public SightsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);


        // Sights ArrayList
        final ArrayList<Place> places = new ArrayList<>();

        // Populating the ArrayList
        places.add(new Place(getString(R.string.oceanarium), getString(R.string.oceanarium_hours), getString(R.string.type_experience), R.drawable.wiki_cascais_btn));
        places.add(new Place(getString(R.string.jeronimos), getString(R.string.jeronimos_hours), getString(R.string.sights), R.drawable.wiki_sintra_btn));
        places.add(new Place(getString(R.string.castelo), getString(R.string.castelo_hours), getString(R.string.sights), R.drawable.wiki_lisbon_btn));
        places.add(new Place(getString(R.string.torre), getString(R.string.torre_hours), getString(R.string.sights), R.drawable.wiki_portugal_btn));


        // setting up the adapter
        final PlacesAdapter placesAdapter = new PlacesAdapter(getActivity(), places);

        // Declaring the ListView
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        assert listView != null;

        listView.setAdapter(placesAdapter);

        return rootView;
    }
}