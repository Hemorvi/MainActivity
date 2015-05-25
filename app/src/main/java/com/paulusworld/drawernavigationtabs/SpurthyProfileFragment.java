package com.paulusworld.drawernavigationtabs;

import android.app.ActionBar;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class SpurthyProfileFragment extends Fragment implements ActionBar.OnNavigationListener {

    private ActionBar actionBar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.spurthy_profile, container, false);

        return view;
    }

    @Override
    public boolean onNavigationItemSelected(int i, long l) {
        return false;
    }
}