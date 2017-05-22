package com.lisbonoasis.app.tourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.lisbonoasis.app.tourguideapp.tab_fragment.DaytripFragment;
import com.lisbonoasis.app.tourguideapp.tab_fragment.NightlifeFragment;
import com.lisbonoasis.app.tourguideapp.tab_fragment.RestaurantsFragment;
import com.lisbonoasis.app.tourguideapp.tab_fragment.SightsFragment;

/**
 * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
class SectionsPagerAdapter extends FragmentPagerAdapter {

    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        if(position == 0) {
            return new SightsFragment();
        } else if (position == 1) {
            return new RestaurantsFragment();
        } else if(position == 2) {
            return new NightlifeFragment();
        } else return new DaytripFragment();
    }

    @Override
    public int getCount() {
        // Show 4 total pages.
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return mContext.getString(R.string.sights);
            case 1:
                return mContext.getString(R.string.restaurants);
            case 2:
                return mContext.getString(R.string.nightlife);
            case 3:
                return mContext.getString(R.string.daytrips);
        }
        return null;
    }
}