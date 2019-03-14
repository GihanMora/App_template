package com.blogspot.gihanmora.OrganicSinhalen;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Gihan bc on 8/18/2017.
 */

public class Tab1  extends Fragment  {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab13, container, false);
        final ViewPager pager=   (ViewPager)getActivity().findViewById(R.id.container);
        Button btn = (Button)rootView.findViewById(R.id.but2);
        Button btn1 = (Button)rootView.findViewById(R.id.but3);
        Button btn2 = (Button)rootView.findViewById(R.id.but4);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pager.setCurrentItem(0);


            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pager.setCurrentItem(1);


            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pager.setCurrentItem(2);


            }
        });


        return rootView;
    }

}
