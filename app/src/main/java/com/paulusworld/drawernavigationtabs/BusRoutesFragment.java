package com.paulusworld.drawernavigationtabs;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

/**
 * Created by Hemorvi Champaneria on 25-05-2015.
 */
public class BusRoutesFragment extends Fragment implements ActionBar.OnNavigationListener {

    ListView list;
    String[] classes = {
            "SGS001",
            "SGS002",
            "SGS003",
            "SGS004",
            "SGS005",
            "SGS006",
            "SGS007",
            "SGS008",
            "SGS009",
            "SGS010",
    } ;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.busroutslist, container, false);
        CustomList adapter = new
                CustomList(getActivity(), classes);
        list=(ListView)view.findViewById(R.id.busroute);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {

               /* FragmentManager fragmentManager = getFragmentManager();*/

                switch (position) {
                    case 0:

                        Intent i = new Intent(getActivity(), FirstClassAttendanceActivity.class);
                        startActivity(i);
                        break;

                    case 1:

                        Intent in = new Intent(getActivity(), SecondClassAttendanceActivity.class);
                        startActivity(in);
                        break;

                    case 2:

                        Intent intent = new Intent(getActivity(), ThirdClassAttendanceActivity.class);
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
