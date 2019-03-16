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
        Button rh = (Button)rootView.findViewById(R.id.rh);
        Button rc2cr = (Button)rootView.findViewById(R.id.rc2cr);
        Button rc3cr = (Button)rootView.findViewById(R.id.rc3cr);
        Button rx = (Button)rootView.findViewById(R.id.rx);
        Button ben = (Button)rootView.findViewById(R.id.ben);
        Button roh = (Button)rootView.findViewById(R.id.roh);
        Button fen = (Button)rootView.findViewById(R.id.fen);
        Button rcor = (Button)rootView.findViewById(R.id.rcor);
        Button rcooh = (Button)rootView.findViewById(R.id.rcooh);
        Button rcocl = (Button)rootView.findViewById(R.id.rcocl);
        Button fenh2 = (Button)rootView.findViewById(R.id.fenh2);
        Button rnh2 = (Button)rootView.findViewById(R.id.rnh2);
        rh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { pager.setCurrentItem(1);
            }
        });
        rc2cr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { pager.setCurrentItem(2);
            }
        });
        rc3cr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { pager.setCurrentItem(3);
            }
        });
        rx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { pager.setCurrentItem(4);
            }
        });
        ben.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { pager.setCurrentItem(5);
            }
        });
        fen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { pager.setCurrentItem(6);
            }
        });
        rcor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { pager.setCurrentItem(7);
            }
        });
        rcooh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { pager.setCurrentItem(8);
            }
        });
        rcocl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { pager.setCurrentItem(9);
            }
        });
        fenh2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { pager.setCurrentItem(10);
            }
        });
        rnh2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { pager.setCurrentItem(11);
            }
        });






        return rootView;
    }

}
