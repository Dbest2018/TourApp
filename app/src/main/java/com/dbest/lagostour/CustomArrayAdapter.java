package com.dbest.lagostour;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class CustomArrayAdapter extends ArrayAdapter<TourItem> {
    private int mColorResourceId;
    public CustomArrayAdapter(Context context, int colorResourceId, ArrayList<TourItem> tourItems) {
        super(context, colorResourceId, tourItems);
        mColorResourceId = colorResourceId;
    }


    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.item_properties, parent, false);
        }
        TourItem an_item = getItem(position);

        TextView nameOfItem = (TextView) listItemView.findViewById(R.id.name_text_view);
        nameOfItem.setText( an_item.getNameOfTourItem());

        TextView addressOfItem = (TextView) listItemView.findViewById(R.id.address_text_view);
        addressOfItem.setText( an_item.getAddressOfTourItem());

        TextView qualityOfItem = (TextView) listItemView.findViewById(R.id.item_quality_text_view);
        qualityOfItem.setText( an_item.getTourItemQuality());



        ImageView imageView = (ImageView) listItemView.findViewById(R.id.default_image);
        if (an_item.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(an_item.getImageResourceId());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }
        //set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        //find the color that resource ID maps to
        int color = ContextCompat.getColor(getContext(),mColorResourceId);
        //set the background color of the text container view
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
