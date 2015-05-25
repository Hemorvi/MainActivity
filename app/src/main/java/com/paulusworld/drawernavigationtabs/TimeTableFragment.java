package com.paulusworld.drawernavigationtabs;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
/**
 * Created by Hemorvi Champaneria on 23-05-2015.
 */
public class TimeTableFragment extends Fragment implements ActionBar.OnNavigationListener {

    ListView list;
    String[] classes = {
            "1st",
            "2nd",
            "3rd",
            "4th",
            "5th",
            "6th",
            "7th",
            "8th"
    } ;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.timetable, container, false);
        CustomList adapter = new
                CustomList(getActivity(), classes);
        list=(ListView)view.findViewById(R.id.timetable);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {

               /* FragmentManager fragmentManager = getFragmentManager();*/

                switch (position) {
                    case 0:

                        Intent i = new Intent(getActivity(), FirstClassActivity.class);
                        startActivity(i);
                        break;

                    case 1:

                        Intent in = new Intent(getActivity(), SecondClassActivity.class);
                        startActivity(in);
                        break;

                    case 2:

                        Intent intent = new Intent(getActivity(), ThirdClassActivity.class);
                        startActivity(intent);
                        break;
                }

                /*Intent intent = new Intent(context, SendMessage.class);
                String message = "abc";
                intent.putExtra(EXTRA_MESSAGE, message);
                startActivity(intent);*/
            }
        });


        return view;
    }

    @Override
    public boolean onNavigationItemSelected(int i, long l) {
        return false;
    }
}