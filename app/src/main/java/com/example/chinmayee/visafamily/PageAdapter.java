package com.example.chinmayee.visafamily;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Chinmayee on 12/12/2015.
 */
public class PageAdapter extends FragmentPagerAdapter {
    private static int NUM_ITEMS = 3;

    public PageAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    // Returns total number of pages
    @Override
    public int getCount() {
        return NUM_ITEMS;
    }
    // Returns the fragment to display for that page
    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0: // Fragment # 0 - This will show FirstFragment
                return SecondFragment.newInstance("Member 2");
            case 1: // Fragment # 0 - This will show FirstFragment different title
                return MyFragment.newInstance("Chinmayee");
            case 2: // Fragment # 1 - This will show SecondFragment
                return MyFragment.newInstance("Vidhi");
            default:
                return null;
        }
    }

    // Returns the page title for the top indicator
    @Override
    public CharSequence getPageTitle(int position) {
        return "Page " + position;
    }

}