package com.blogspot.gihanmora.OrganicSinhalen;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import static com.blogspot.gihanmora.OrganicSinhalen.MainActivity.mInterstitialAd;

/**
 * Created by Gihan bc on 8/18/2017.
 */

public class Tab13 extends Fragment {
    int position;
    private MainActivity.SectionsPagerAdapter mSectionsPagerAdapter;
    private ViewPager mViewPager;
    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab1, container, false);


        // Set up the ViewPager with the sections adapter.


        return rootView;
    }

}
