package com.blogspot.gihanmora.AppTemplate;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.blogspot.gihanmora.AppTemplate.R;
import com.google.android.gms.ads.AdView;

/**
 * Created by Gihan bc on 8/18/2017.
 */

public class Tab1 extends Fragment {
    int position;
    private MainActivity.SectionsPagerAdapter mSectionsPagerAdapter;
    private ViewPager mViewPager;
    private AdView mAdView33,mAdView4,mAdView5,mAdView6;
    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab1, container, false);

//        mAdView33 = (AdView)rootView.findViewById(R.id.adView33);
//        mAdView4 = (AdView)rootView.findViewById(R.id.adView4);
//        mAdView5 = (AdView)rootView.findViewById(R.id.adView5);
//        mAdView6 = (AdView)rootView.findViewById(R.id.adView6);
//
//        mAdView33.loadAd(new AdRequest.Builder().build());
//        mAdView4.loadAd(new AdRequest.Builder().build());
//        mAdView5.loadAd(new AdRequest.Builder().build());
//        mAdView6.loadAd(new AdRequest.Builder().build());
        // Set up the ViewPager with the sections adapter.


        return rootView;
    }

}
