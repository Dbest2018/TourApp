package com.dbest.lagostour;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HotelsFragment extends Fragment {


    public HotelsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.tour_items, container, false);
        final ArrayList<TourItem> tourItem = new ArrayList<TourItem>();
        tourItem.add(new TourItem("The Wheatbaker","4 Onittilo road, lawrence road, Ikoyi Lagos","5 stars, 8.7 ratings",R.drawable.the_wheat_baker));
        tourItem.add(new TourItem("Lagos Continental Hotel","Plot 52A kofo Abayomi street, Victoria island lagos","5 stars, 8.1 ratings",R.drawable.lagos_continental_hotel));
        tourItem.add(new TourItem("The Goerge Hotel","30 lugard Avenue, ikoyi Lagos","5 stars, 7.8 ratings",R.drawable.the_george_hotel));
        tourItem.add(new TourItem("Radisson Blu Anchorage Hotel","1 Ozumba Mbadiwe Avenue, Victoris Island, Lagos, VI Lagos","5 stars, 7.8 ratings",R.drawable.radisson_blu));
        tourItem.add(new TourItem("Lagos Oriental Hotel","3 Maroko road,Lekki-Epe Express Way Lagos","5 stars, 7.3 ratings",R.drawable.oriental_hotel));
        tourItem.add(new TourItem("Eko Hotel & suites","1415 Adetokunbo Ademola Street, Victoria Island, Lagos","5 stars, 7.1 ratings",R.drawable.eko_hotel));
        tourItem.add(new TourItem("Tajmahal Hotels","Kayode koyejo street,off Liasu road,Egbe Lagos","4 stars, 10 ratings",R.drawable.tajmahal_place));



        CustomArrayAdapter adapter = new CustomArrayAdapter(getActivity(),R.color.textBackgroundOne,tourItem);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);


        return rootView;

    }

}
