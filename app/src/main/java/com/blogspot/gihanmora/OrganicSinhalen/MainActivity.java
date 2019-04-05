package com.blogspot.gihanmora.OrganicSinhalen;

import android.content.Intent;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;

import android.widget.HorizontalScrollView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.InterstitialAd;


public class MainActivity extends AppCompatActivity {

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;
    HorizontalScrollView sv;
    private AdView mAdView;
    public static InterstitialAd mInterstitialAd;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;
    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;

    NavigationView navigationView;

    FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MobileAds.initialize(this.getApplicationContext(),"ca-app-pub-5202253201958912~4166368789");

        AdRequest adRequest = new AdRequest.Builder().build();
        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-5202253201958912/2282186946");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        } else {
            Log.d("TAG", "The interstitial wasn't loaded yet.");
        }

        
        //sv= (HorizontalScrollView)findViewById(R.id.sv);
        final Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        AppBarLayout app=(AppBarLayout)findViewById(R.id.appbar);
        app.setOnTouchListener(new View.OnTouchListener(){
            @Override
            public boolean onTouch(View v, MotionEvent event){
                switch(event.getAction()){
                    default:
                        getSupportActionBar().show();
                }
            return false;
            }
        });


        setSupportActionBar(toolbar);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        mToggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.string.open, R.string.close);
        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        mViewPager = (ViewPager) findViewById(R.id.container);
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        navigationView =(NavigationView)findViewById(R.id.nevigationView);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener(){
            @Override
            public boolean onNavigationItemSelected(MenuItem item){
                switch (item.getItemId()){
                    case R.id.tab0:
                        Intent ii=new Intent(MainActivity.this,MainActivity.class);
                        startActivity(ii);

                        mDrawerLayout.closeDrawers();
                        break;
                    case R.id.tab01:
                        mViewPager.setCurrentItem(1);
                        mDrawerLayout.closeDrawers();
                        break;
                    case R.id.tab02:
                        mViewPager.setCurrentItem(2);
                        mDrawerLayout.closeDrawers();break;
                    case R.id.tab03:
                        mViewPager.setCurrentItem(3);
                        mDrawerLayout.closeDrawers();break;
                    case R.id.tab04:
                        mViewPager.setCurrentItem(4);
                        mDrawerLayout.closeDrawers();break;
                    case R.id.tab05:
                        mViewPager.setCurrentItem(5);
                        mDrawerLayout.closeDrawers();break;
                    case R.id.tab06:
                        mViewPager.setCurrentItem(6);
                        mDrawerLayout.closeDrawers();break;
                    case R.id.tab07:
                        mViewPager.setCurrentItem(7);
                        mDrawerLayout.closeDrawers();break;
                    case R.id.tab08:
                        mViewPager.setCurrentItem(8);
                        mDrawerLayout.closeDrawers();break;
                    case R.id.tab09:
                        mViewPager.setCurrentItem(9);
                        mDrawerLayout.closeDrawers();break;
                    case R.id.tab10:
                        mViewPager.setCurrentItem(10);
                        mDrawerLayout.closeDrawers();break;
                    case R.id.tab11:
                        mViewPager.setCurrentItem(11);
                        mDrawerLayout.closeDrawers();break;
                    case R.id.tab12:
                        mViewPager.setCurrentItem(12);
                        mDrawerLayout.closeDrawers();break;
                    case R.id.tab13:
                        mViewPager.setCurrentItem(13);
                        mDrawerLayout.closeDrawers();break;
                    case R.id.tab1:

                        Intent iii=new Intent(MainActivity.this,Main2Activity.class);
                        startActivity(iii);

                        mDrawerLayout.closeDrawers();
                        if (mInterstitialAd.isLoaded()) {
                            mInterstitialAd.show();
                        } else {
                            Log.d("TAG", "The interstitial wasn't loaded yet.");
                        }
                        break;
                    case R.id.tab2:
                        try {
                            if (mInterstitialAd.isLoaded()) {
                                mInterstitialAd.show();
                            } else {
                                Log.d("TAG", "The interstitial wasn't loaded yet.");
                            }

                            Intent i = new Intent(Intent.ACTION_SEND);
                            i.setType("text/plain");
                            i.putExtra(Intent.EXTRA_SUBJECT, "My application name");
                            String sAux = "\nOrganic සිංහලෙන්\nකාබනික පරිවර්තනතන නිවැරදිව හා පහසුවෙන් කිරීම්ට හොඳම මඟ පෙන්වීම....\nDownload>>\n";
                            sAux = sAux + " https://play.google.com/store/apps/details?id=com.blogspot.gihanmora.OrganicSinhalen\n\n";
                            i.putExtra(Intent.EXTRA_TEXT, sAux);
                            startActivity(Intent.createChooser(i, "Choose One"));
                        } catch(Exception e) {
                            //e.toString();
                        }
                        mDrawerLayout.closeDrawers();
                        if (mInterstitialAd.isLoaded()) {
                            mInterstitialAd.show();
                        } else {
                            Log.d("TAG", "The interstitial wasn't loaded yet.");
                        }
                        break;
                    case R.id.tab3:
                        if (mInterstitialAd.isLoaded()) {
                            mInterstitialAd.show();
                        } else {
                            Log.d("TAG", "The interstitial wasn't loaded yet.");
                        }
                        System.exit(0);
                        break;

                    //case R.id.tab22:
                     //   Intent ii3=new Intent(MainActivity.this,Main3Activity.class);
                    //    startActivity(ii3);

                     //   mDrawerLayout.closeDrawers();
                     //   break;





                }
                return false;
            }

        });



        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.

        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);


        tabLayout.setupWithViewPager(mViewPager);
        tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);


    }




    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        if (mToggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public static class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch(position){
                case 0:
                    if (mInterstitialAd.isLoaded()) {
                        mInterstitialAd.show();
                    } else {
                        Log.d("TAG", "The interstitial wasn't loaded yet.");
                    }
                    Tab1 tb1 =new Tab1();

                    return tb1;
                case 1:
                    if (mInterstitialAd.isLoaded()) {
                        mInterstitialAd.show();
                    } else {
                        Log.d("TAG", "The interstitial wasn't loaded yet.");
                    }
                    Tab13 tb13 =new Tab13();

                    return tb13;
                case 2:
                    if (mInterstitialAd.isLoaded()) {
                        mInterstitialAd.show();
                    } else {
                        Log.d("TAG", "The interstitial wasn't loaded yet.");
                    }

                    Tab2 tb2 =new Tab2();

                    return tb2;
                case 3:
                    if (mInterstitialAd.isLoaded()) {
                        mInterstitialAd.show();
                    } else {
                        Log.d("TAG", "The interstitial wasn't loaded yet.");
                    }

                    Tab3 tb3 =new Tab3();
                    return tb3;
                case 4:
                    if (mInterstitialAd.isLoaded()) {
                        mInterstitialAd.show();
                    } else {
                        Log.d("TAG", "The interstitial wasn't loaded yet.");
                    }
                    Tab4 tb5 =new Tab4();
                    return tb5;
                case 5:
                    if (mInterstitialAd.isLoaded()) {
                        mInterstitialAd.show();
                    } else {
                        Log.d("TAG", "The interstitial wasn't loaded yet.");
                    }

                    Tab5 tb6 =new Tab5();
                    return tb6;
                case 6:
                    if (mInterstitialAd.isLoaded()) {
                        mInterstitialAd.show();
                    } else {
                        Log.d("TAG", "The interstitial wasn't loaded yet.");
                    }
                    Tab6 tb7 =new Tab6();
                    return tb7;
                case 7:
                    if (mInterstitialAd.isLoaded()) {
                        mInterstitialAd.show();
                    } else {
                        Log.d("TAG", "The interstitial wasn't loaded yet.");
                    }
                    Tab7 tb8 =new Tab7();
                    return tb8;
                case 8:
                    if (mInterstitialAd.isLoaded()) {
                        mInterstitialAd.show();
                    } else {
                        Log.d("TAG", "The interstitial wasn't loaded yet.");
                    }
                    Tab8 tb9 =new Tab8();
                    return tb9;
                case 9:
                    if (mInterstitialAd.isLoaded()) {
                        mInterstitialAd.show();
                    } else {
                        Log.d("TAG", "The interstitial wasn't loaded yet.");
                    }
                    Tab9 tb10 =new Tab9();
                    return tb10;
                case 10:
                    if (mInterstitialAd.isLoaded()) {
                        mInterstitialAd.show();
                    } else {
                        Log.d("TAG", "The interstitial wasn't loaded yet.");
                    }
                    Tab10 tb11 =new Tab10();
                    return tb11;
                case 11:
                    if (mInterstitialAd.isLoaded()) {
                        mInterstitialAd.show();
                    } else {
                        Log.d("TAG", "The interstitial wasn't loaded yet.");
                    }
                    Tab11 tb12 =new Tab11();
                    return tb12;
                case 12:
                    if (mInterstitialAd.isLoaded()) {
                        mInterstitialAd.show();
                    } else {
                        Log.d("TAG", "The interstitial wasn't loaded yet.");
                    }
                    Tab12 tb122 =new Tab12();
                    return tb122;
                case 13:
                    if (mInterstitialAd.isLoaded()) {
                        mInterstitialAd.show();
                    } else {
                        Log.d("TAG", "The interstitial wasn't loaded yet.");
                    }
                    Tab14 tb113 =new Tab14();
                    return tb113;
                default:
                    return null;

            }
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return 14;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "මුල් පිටුව";
                case 1:
                    return "ඇල්කේන";
                case 2:
                    return "ඇල්කීන";
                case 3:
                    return "ඇල්කයින";
                case 4:
                    return "ඇල්කිල් හේලයිඩ";
                case 5:
                    return "බෙන්සීන්";
                case 6:
                    return "ඇල්කොහොල";
                case 7:
                    return "ෆීනෝල";
                case 8:
                    return "ඇල්ඩිහයිඩ හා කීටෝන";
                case 9:
                    return "කාබොක්සිලික් අම්ල";
                case 10:
                    return "අම්ල ක්ලෝරයිඩ";
                case 11:
                    return "ඇමීන";
                case 12:
                    return "ඇනිලීන්";
                case 13:
                    return "ඇමයිඩ";


            }
            return null;
        }
    }
}
