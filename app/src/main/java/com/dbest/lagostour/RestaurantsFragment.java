package com.dbest.lagostour;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

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
        View rootView = inflater.inflate(R.layout.tour_items, container, false);
        final ArrayList<TourItem> tourItem = new ArrayList<TourItem>();
        tourItem.add(new TourItem("Sunrise CHinese Restaurant","32 Aromire Ave, oba Akron,Ikeja","4.1 stars",R.drawable.sunrise_res));
        tourItem.add(new TourItem("Bungalow Restaurant Ikeja","58a isaac John st, Ikeja GRA, Ikeja","4.2 stars",R.drawable.bungalow_res));
        tourItem.add(new TourItem("Pizza House","9 Adekunle Fajuyi Way, Way,Ikeja GRA, Ikeja","4.2 stars",R.drawable.pizza_house));
        tourItem.add(new TourItem("Golden Eagle Spur","53 isaac John,st,Ikeja GRA, Lagos","4.3 stars",R.drawable.golden_res));
        tourItem.add(new TourItem("so Fresh Ogudu","40b Ogudu Rd, kosofe, Lagos","4.7 stars",R.drawable.so_fresh_res));
        tourItem.add(new TourItem("Magrellos Fast Food & Bakery","169 Ogudu Rd, Kosofe, Lagos","3.9 stars",R.drawable.magrellos_res));
        tourItem.add(new TourItem("Calabar Kitchen","27 oluwaleyimu street Allen,Ikeja","3.9 stars",R.drawable.calabar_kitchen));
        tourItem.add(new TourItem("RSVP restaurant","9 Eletu Ogabi st, Victoria island,Lagos","4.3 stars",R.drawable.rsvp));
        tourItem.add(new TourItem("The Place","45 Isac John st, ikeja GRA, Lagos","4.1 stars",R.drawable.the_place));


        CustomArrayAdapter adapter = new CustomArrayAdapter(getActivity(),R.color.textBackgroundOne,tourItem);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);


        return rootView;
    }

}
