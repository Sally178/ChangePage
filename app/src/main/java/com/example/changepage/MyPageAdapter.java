package com.example.changepage;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class MyPageAdapter extends FragmentPagerAdapter {

    public MyPageAdapter(FragmentManager fm){
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==1)
            return new SecondFragment();
        else if (position==0)
            return new HomeFragment();
        else
            return new ThirdFragment();
    }

    @Override
    public CharSequence getPageTitle(int position){
        return "title "+position;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
