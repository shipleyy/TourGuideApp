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
public class NightlifeFragment extends Fragment {


    public NightlifeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);


        // Sights ArrayList
        final ArrayList<Place> nightlife = new ArrayList<>();

        // Populating the ArrayList
        nightlife.add(new Place(getString(R.string.henneseys), getString(R.string.henneseys_hours), getString(R.string.type_english), R.drawable.wiki_cascais_btn));
        nightlife.add(new Place(getString(R.string.chinese), getString(R.string.chinese_hours), getString(R.string.type_irish), R.drawable.wiki_lisbon_btn));
        nightlife.add(new Place(getString(R.string.pensao), getString(R.string.pensao_hours), getString(R.string.type_portuguese), R.drawable.wiki_sintra_btn));
        nightlife.add(new Place(getString(R.string.urban), getString(R.string.urban_hours), getString(R.string.type_disco), R.drawable.wiki_cascais_btn));


        // setting up the adapter
        final PlacesAdapter placesAdapter = new PlacesAdapter(getActivity(), nightlife);

        // Declaring the ListView
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        assert listView != null;

        listView.setAdapter(placesAdapter);

        return rootView;
    }

}
