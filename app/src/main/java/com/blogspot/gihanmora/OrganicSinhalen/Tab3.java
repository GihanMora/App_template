package com.blogspot.gihanmora.OrganicSinhalen;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

/**
 * Created by Gihan bc on 8/18/2017.
 */

public class Tab3 extends Fragment {
    private AdView mAdView33,mAdView32,mAdView31,mAdView34;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab3, container, false);
        mAdView33 = (AdView)rootView.findViewById(R.id.adView33);
        mAdView32 = (AdView)rootView.findViewById(R.id.adView32);
        mAdView31 = (AdView)rootView.findViewById(R.id.adView31);
        mAdView34 = (AdView)rootView.findViewById(R.id.adView34);

        mAdView33.loadAd(new AdRequest.Builder().build());
        mAdView32.loadAd(new AdRequest.Builder().build());
        mAdView31.loadAd(new AdRequest.Builder().build());
        mAdView34.loadAd(new AdRequest.Builder().build());
        return rootView;
    }
}