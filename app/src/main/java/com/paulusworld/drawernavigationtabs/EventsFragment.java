package com.paulusworld.drawernavigationtabs;


import android.app.ActionBar;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class EventsFragment extends Fragment implements ActionBar.OnNavigationListener {

    ListView list;
    String[] date = {
            "june 1",
            "july 10",
            "july 24",
            "aug 15",
            "aug 22",
            "sept 15",
            "sept 23",
            "oct 8",
            "oct 24",
            "nov 5",
            "nov 22",
            "dec 2",
            "dec 25"
    } ;

    String[] events={"school reopening, new admissions",
            "1st unit test",
            "parent's meeting",
            "independence day celebration",
            "2nd unit test",
            "Engineer's day celebration",
            "3rd unit test",
            "dasara holidays",
            "preparatory Exams for primary school",
            "teacher's day",
            "school day",
             "parent's meeting",
            "christmas holidays"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_events, container, false);
        CustomListNotify adapter = new CustomListNotify(getActivity(), date,events);
        list=(ListView)view.findViewById(R.id.events_list);
        list.setAdapter(adapter);
        return view;
    }

    @Override
    public boolean onNavigationItemSelected(int i, long l) {
        return false;
    }
}