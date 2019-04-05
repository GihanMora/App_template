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

public class Tab11 extends Fragment {
    private AdView mAdView41,mAdView42,mAdView43,mAdView44,mAdView45,mAdView46;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab11, container, false);
        mAdView43 = (AdView)rootView.findViewById(R.id.adView111);
        mAdView42 = (AdView)rootView.findViewById(R.id.adView112);
        mAdView41 = (AdView)rootView.findViewById(R.id.adView113);



        mAdView43.loadAd(new AdRequest.Builder().build());
        mAdView42.loadAd(new AdRequest.Builder().build());
        mAdView41.loadAd(new AdRequest.Builder().build());


        return rootView;
    }
}
