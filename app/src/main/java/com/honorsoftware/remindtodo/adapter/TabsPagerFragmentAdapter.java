package com.honorsoftware.remindtodo.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.honorsoftware.remindtodo.fragment.AbstarctTabFragment;
import com.honorsoftware.remindtodo.fragment.BithdaysFragment;
import com.honorsoftware.remindtodo.fragment.HistoryFragment;
import com.honorsoftware.remindtodo.fragment.IdeasFragment;
import com.honorsoftware.remindtodo.fragment.ToDoFragment;

import java.util.HashMap;
import java.util.Map;

public class TabsPagerFragmentAdapter extends FragmentPagerAdapter {

    private Map<Integer, AbstarctTabFragment> tabs;
    private Context context;

    public TabsPagerFragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
        initTabMap(context);
    }


    public CharSequence getPageTitle(int position) {
        return tabs.get(position).getTitle();
    }

    @Override
    public Fragment getItem(int position) {
        return tabs.get(position);
    }

    @Override
    public int getCount() {
        return tabs.size();
    }

    private void initTabMap(Context context) {
        tabs = new HashMap<>();
        tabs.put(0, HistoryFragment.getInstance(context));
        tabs.put(1, IdeasFragment.getInstance(context));
        tabs.put(2, ToDoFragment.getInstance(context));
        tabs.put(3, BithdaysFragment.getInstance(context));
    }

}
