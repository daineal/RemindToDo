package com.honorsoftware.remindtodo.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.honorsoftware.remindtodo.R;

public class BithdaysFragment extends AbstarctTabFragment {

    private final int LAYOUT = R.layout.fragment_example;


    public static BithdaysFragment getInstance(Context context) {
        Bundle args = new Bundle();
        BithdaysFragment fragment = new BithdaysFragment();
        fragment.setArguments(args);
        fragment.setContext(context);
        fragment.setTitle(context.getString(R.string.tab_item_birthdays));

        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT, container, false);
        return view;
    }

    public void setContext(Context context) {
        this.context = context;
    }
}
