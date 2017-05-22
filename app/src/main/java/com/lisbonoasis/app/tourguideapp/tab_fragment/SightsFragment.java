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

public class SightsFragment extends Fragment {

    public SightsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);


        // Sights ArrayList
        final ArrayList<Places> places = new ArrayList<>();

        // Populating the ArrayList
        places.add(new Places("Lisbon Oceanarium", "Sun - Sat 10:00 am - 7:00 pm", "Experiences", R.drawable.wiki_cascais_btn));
        places.add(new Places("Jeronimos Monastery", "Tue - Sun 10:00 am - 6:00 pm", "Sights", R.drawable.wiki_sintra_btn));
        places.add(new Places("Castelo de S. Jorge", "Sun - Sat 9:00 am - 6:00 pm", "Sights", R.drawable.wiki_lisbon_btn));
        places.add(new Places("Torre de Belem", "Tue - Sun 10:00 am - 5:00 pm", "Sights", R.drawable.wiki_portugal_btn));


        // setting up the adapter
        final PlacesAdapter placesAdapter = new PlacesAdapter(getActivity(), places);

        // Declaring the ListView
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        assert listView != null;

        listView.setAdapter(placesAdapter);

        return rootView;
    }
}