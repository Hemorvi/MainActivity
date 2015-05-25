package com.paulusworld.drawernavigationtabs;


import android.app.ActionBar;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class MessageFragment extends Fragment implements ActionBar.OnNavigationListener {

    ListView list;
    String[] from = {
            "Chandramouli srinivas",
            "Rajashekar",
            "Chandramouli srinivas",
            "Ramgopal",
            "Suresh",
            "Ajit",
            "Chandrashekar",
            "Abhishek",
            "Rakesh",
            "Parimala",
            "Ashwini"
    } ;
    String[] messages = {
            "please come to my chamber",
            "check the updated balance of yours",
            "while coming bring the accounts bill book",
            "please send me the fee details",
            "please be intime for office",
            "come to principal office please immidietly",
            "please update the balance sheet for this year by tomorrow",
            "your are lagging behind your tasks",
            "please call me",
            "welcome to spurthy school",
            "please update our salary",
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_notifications, container, false);
        CustomListNotify adapter = new
                CustomListNotify(getActivity(), from, messages);
        list=(ListView)view.findViewById(R.id.notification_list);
        list.setAdapter(adapter);
        return view;
    }

    @Override
    public boolean onNavigationItemSelected(int i, long l) {
        return false;
    }
}