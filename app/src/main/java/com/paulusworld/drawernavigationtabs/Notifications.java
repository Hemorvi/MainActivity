package com.paulusworld.drawernavigationtabs;


import android.app.ActionBar;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class Notifications extends Fragment implements ActionBar.OnNavigationListener {

    ListView list;
    String[] from = {
            "from: spurthy group",
            "from: chandramouli srinivas",
            "from: chandramouli srinivas",
            "from: ramgopal",
            "from: rajesh",
            "from: spurthy group",
            "from: Chandrashekar",
            "from: abhishek",
            "from: spurthy students group",
            "from: ramgopal",
            "from: teachers club"
    } ;


    String[] notifications = {
      "spurthy group added your photos in spurthy group",
      "chandramouli srinivas added you to his friend list",
      "chandramouli srinivas said he was with you yesterday",
      "ramgopal asked you to join spurthy group",
      "rajesh asked your salary package",
      "spurthy group sent you a request",
      "chandrashekar sent you a birhtday wish",
      "abhishek said you have to update tasks",
      "spurthy students group asked the fee systems for this year",
      "ramgopal asked you to update fee amount",
      "teachers club asked you to update salary",
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_notifications, container, false);
        CustomListNotify adapter = new
                CustomListNotify(getActivity(), from, notifications);
        list=(ListView)view.findViewById(R.id.notification_list);
        list.setAdapter(adapter);
        return view;
    }

    @Override
    public boolean onNavigationItemSelected(int i, long l) {
        return false;
    }
}