 package com.example.tugasp5;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

 public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = (TabLayout) findViewById(R.id.tablayout_id);
        viewPager = (ViewPager) findViewById(R.id.viewpager_id);
        adapter = new ViewPagerAdapter(getSupportFragmentManager());
        // add fragment
        adapter.AddFragment(new FragmentCall(),"");
        adapter.AddFragment(new FragmentContact(),"");
        adapter.AddFragment(new FragmentFav(),"");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_baseline_call_24);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_baseline_group_24);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_baseline_star_rate_24);

        //remove shadow
        ActionBar actionBar = getSupportActionBar();
        actionBar.setElevation(0);
    }
}