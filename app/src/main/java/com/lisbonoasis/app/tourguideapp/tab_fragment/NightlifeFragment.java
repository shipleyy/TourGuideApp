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
public class NightlifeFragment extends Fragment {


    public NightlifeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);


        // Sights ArrayList
        final ArrayList<Places> nightlife = new ArrayList<>();

        // Populating the ArrayList
        nightlife.add(new Places("Hennesey's", "Sun - Sat 10:00 am - 2:00 am", "English Pub", R.drawable.wiki_cascais_btn));
        nightlife.add(new Places("Pavilhao Chinese", "Tue - Sun 10:00 am - 2:00 am", "Irish Pub", R.drawable.wiki_lisbon_btn));
        nightlife.add(new Places("Pensao do Amor", "Sun - Sat 6:00 pm - 04:00 am", "Portuguese Bar", R.drawable.wiki_sintra_btn));
        nightlife.add(new Places("Urban Beach", "Tue - Sun 10:00 am - 5:00 am", "Disco", R.drawable.wiki_cascais_btn));


        // setting up the adapter
        final PlacesAdapter placesAdapter = new PlacesAdapter(getActivity(), nightlife);

        // Declaring the ListView
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        assert listView != null;

        listView.setAdapter(placesAdapter);

        return rootView;
    }

}
