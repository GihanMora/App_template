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

public class Tab5 extends Fragment {
    private AdView mAdView41,mAdView42,mAdView43;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab5, container, false);
        mAdView43 = (AdView)rootView.findViewById(R.id.adView53);
        mAdView42 = (AdView)rootView.findViewById(R.id.adView52);
        mAdView41 = (AdView)rootView.findViewById(R.id.adView51);


        mAdView43.loadAd(new AdRequest.Builder().build());
        mAdView42.loadAd(new AdRequest.Builder().build());
        mAdView41.loadAd(new AdRequest.Builder().build());
        return rootView;
    }
}
