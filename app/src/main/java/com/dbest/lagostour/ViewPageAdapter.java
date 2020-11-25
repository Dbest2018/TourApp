package com.dbest.lagostour;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentManager;



public class ViewPageAdapter extends FragmentPagerAdapter {
private Context context;

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if(position==0)
            return "Hotels";
        else if(position==1)
            return "Restaurants";
        else if(position==2)
            return "Fun";
        else return "Malls";
    }

    @Override
    public Fragment getItem(int i) {
        if(i==0){
            return new HotelsFragment();
        }
        else if(i==1){
            return new RestaurantsFragment();
        }
        else if(i==2){
            return new FunPlacesFragment();
        }
        else return new MallsFragment();
    }



    public ViewPageAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public int getCount() {
        return 4;
    }
}
