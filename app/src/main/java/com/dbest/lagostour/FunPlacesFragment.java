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
public class FunPlacesFragment extends Fragment {


    public FunPlacesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_items, container, false);
        final ArrayList<TourItem> tourItem = new ArrayList<TourItem>();
        tourItem.add(new TourItem("Lekki Conservation Centre","km 19 Lekki-Epe Expy, Lekki Peminsula 11,Lekki","4.3 stars",R.drawable.lekki_conservation));
        tourItem.add(new TourItem("Victoria Island Lagos","victoria island Lagos","4.4 stars",R.drawable.victoria_island));
        tourItem.add(new TourItem("Freedom Park","Broad st, Lagos island, lagos","4.2 stars",R.drawable.freedom_park));
        tourItem.add(new TourItem("Nigerian national museum 3.8","Onikan Rd, Ikoyi, Lagos","3.8 stars",R.drawable.national_museum));
        tourItem.add(new TourItem("Lagos Island","lagos island, lagos","4.1 stars",R.drawable.lagos_island));
        tourItem.add(new TourItem("Lekki Leisure lake","Plot 3 block 1, Okunda Blue water Tourism scheme,lekki,lagos","4.1 stars",R.drawable.lekki_leisure_lake));
        tourItem.add(new TourItem("Elegusin Beach ","Rd 3, lekki phase1, Lekki","4.0 stars",R.drawable.elegushi_beach));
        tourItem.add(new TourItem("Eko Atlantic","1412 Ahmadu Bello way, victoria island,Lagos","4.5 stars",R.drawable.eko_atlantic));
        tourItem.add(new TourItem("Third Mainland Bridge","Ijeh Powa Market, 15b Corporation Dr,ikoyi Lagos","4.0 stars",R.drawable.third_mainland_bridge));
        tourItem.add(new TourItem("Ikoyi","Eti-osa Lagos","4.3 stars",R.drawable.ikoyi));
        tourItem.add(new TourItem("Hi-impact Planet Amusement Park","km 12 lagos-ibadan Expy, Ibafo","4.4 stars",R.drawable.hi_impact_planet));
        tourItem.add(new TourItem("Lagos Lagoon","lagos lagoon","4.0 stars",R.drawable.lagos_lagoon));
        tourItem.add(new TourItem("Apapa Amusement Park","1 Randle Rd,Apapa,lagos","4.0 stars",R.drawable.apapa_amusement_park));
        tourItem.add(new TourItem("Dream World Africa","2nd tollgate km 20 lekki-Ajah Expressway,Lekki Penninsula 11,Lekki","3.9 stars",R.drawable.dream_world_africa));

        CustomArrayAdapter adapter = new CustomArrayAdapter(getActivity(),R.color.textBackgroundOne,tourItem);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);


        return rootView;
    }

}
