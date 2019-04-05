package com.blogspot.gihanmora.OrganicSinhalen;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

/**
 * Created by Gihan bc on 8/18/2017.
 */

public class Tab2 extends Fragment {
    private AdView mAdView3,mAdView4,mAdView5,mAdView6;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab2, container, false);
        mAdView3 = (AdView)rootView.findViewById(R.id.adView21);
        mAdView4 = (AdView)rootView.findViewById(R.id.adView22);
        mAdView5 = (AdView)rootView.findViewById(R.id.adView23);
        mAdView6 = (AdView)rootView.findViewById(R.id.adView24);

        mAdView3.loadAd(new AdRequest.Builder().build());
        mAdView4.loadAd(new AdRequest.Builder().build());
        mAdView5.loadAd(new AdRequest.Builder().build());
        mAdView6.loadAd(new AdRequest.Builder().build());
        return rootView;
    }
}