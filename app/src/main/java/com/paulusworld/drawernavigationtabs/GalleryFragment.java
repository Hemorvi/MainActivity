package com.paulusworld.drawernavigationtabs;

import android.app.ActionBar;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Hemorvi Champaneria on 22-05-2015.
 */
public class GalleryFragment  extends Fragment implements ActionBar.OnNavigationListener {

    private ActionBar actionBar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.gallery, container, false);

        return view;
    }

    @Override
    public boolean onNavigationItemSelected(int i, long l) {
        return false;
    }
}