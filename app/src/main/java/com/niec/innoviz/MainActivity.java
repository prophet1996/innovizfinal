package com.niec.innoviz;

import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;

import com.niec.innoviz.Frags.HomeFragment;
import com.niec.innoviz.Frags.PostFragment;
import com.niec.innoviz.Frags.TAB2;
import com.niec.innoviz.Frags.TAB3;


public class MainActivity extends AppCompatActivity {
    private ViewPager mViewPager;
    private SectionsPagerAdapter mSectionsPagerAdapter;


    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);


    }


    /************************************************************/

    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a PlaceholderFragment (defined as a static inner class below).
            switch (position) {
                case 0:
                    HomeFragment home = new HomeFragment();
                    return home;

                case 1:

                    PostFragment post = new PostFragment();
                    return post;

                case 2:
                    TAB2 tab2 = new TAB2();
                    return tab2;

                case 3:
                    TAB3 tab3 = new TAB3();
                    return tab3;

            }

            return null;
        }

        @Override
        public int getCount() {
            // Show 2 total pages.
            return 4;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "Events";
                case 1:
                    return "Info";
                case 2:
                    return "Past";
                case 3:
                    return "Reach Us";

            }
            return null;
        }
    }


    /************************************************************/


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent b;
        switch(item.getItemId()) {
            case R.id.face:b=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/InnovizNIEC/?fref=ts"));
                            startActivity(b);
                break;
            case R.id.twit:b=new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/innoviz_niec"));
                startActivity(b);
                break;
            case R.id.insta:b=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/innoviz.niec/"));
                startActivity(b);
                break;
            case R.id.action_settings:{Dialog d= new Dialog(this);
            d.getWindow().requestFeature(Window.FEATURE_NO_TITLE);
                d.setContentView(getLayoutInflater().inflate(R.layout.dialog,null));
                d.show();
                break;
            }


        }
        return super.onOptionsItemSelected(item);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);

        return true;
    }



}
