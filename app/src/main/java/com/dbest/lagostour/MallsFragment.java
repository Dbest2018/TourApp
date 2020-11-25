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
public class MallsFragment extends Fragment {


    public MallsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_items, container, false);
        final ArrayList<TourItem> tourItem = new ArrayList<TourItem>();
        tourItem.add(new TourItem("Walkanow","350/360 Ikorodu rd Maryland Lagos","4.3 ratings"));
        tourItem.add(new TourItem("Realities with ujay","350/360 Ikorodu rd Maryland Lagos","4.1 ratings"));
        tourItem.add(new TourItem("Ikeja city mall","194 Obafemi Awolowo Way,Alausa Ikeja","4.3 ratings"));
        tourItem.add(new TourItem("The Palms shopping mall","1 Bisway St Maroko Lekki","4.3 ratings"));
        tourItem.add(new TourItem("Stellamaris Koncept Nigeria Ltd","Ogudu road Ogudu-Ojota Lagos Nigeria","4.3 ratings"));
        tourItem.add(new TourItem("Worth thanks","slot shop8 festiva mall shopito festac","4.2 ratings"));
        tourItem.add(new TourItem("E-Centre Mall","Jos Benson Street Sabo yaba Lagos","4.1 ratings"));
        tourItem.add(new TourItem("China Town","Ketu 100242 Lagos","3.9 ratings"));


        CustomArrayAdapter adapter = new CustomArrayAdapter(getActivity(),R.color.textBackgroundOne,tourItem);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);


        return rootView;
    }

}
