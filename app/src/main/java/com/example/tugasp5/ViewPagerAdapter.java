package com.example.tugasp5;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private final List<Fragment> fragmentSatu = new ArrayList<>();
    private final List<String> titleSatu = new ArrayList<>();

    public ViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragmentSatu.get(position);
    }

    @Override
    public int getCount() {
        return titleSatu.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return titleSatu.get(position);
    }

    public void AddFragment (Fragment fragment, String title){
        fragmentSatu.add(fragment);
        titleSatu.add(title);
    }
}
