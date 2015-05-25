package com.paulusworld.drawernavigationtabs;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by Hemorvi Champaneria on 23-05-2015.
 */
public class TableFragment extends Fragment implements ActionBar.OnNavigationListener {

/*    public final static String TAG = TableFragment.class.getSimpleName();

    public TableFragment() {
        // TODO Auto-generated constructor stub
    }

    public static TableFragment newInstance() {
        return new TableFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setRetainInstance(true);
    }*/

    public static TimeTableFragment newInstance() {
        TimeTableFragment fragment = new TimeTableFragment();
        return fragment;
    }

    public TableFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.first, container, false);


        /*CustomList adapter = new
                CustomList(getActivity(), classes);
        list=(ListView)view.findViewById(R.id.);
        list.setAdapter(adapter);*/

        return view;
    }

    @Override
    public boolean onNavigationItemSelected(int i, long l) {
        return false;
    }
}