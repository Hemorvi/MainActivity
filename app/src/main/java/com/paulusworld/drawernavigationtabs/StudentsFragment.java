package com.paulusworld.drawernavigationtabs;


import android.app.ActionBar;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class StudentsFragment extends Fragment implements ActionBar.OnNavigationListener {

    ListView list;
    String[] students = {
            "Raju",
            "Sangeeta",
            "Pavan",
            "Lakshmi",
            "Saraswathi",
            "Joel",
            "Shankar",
            "Rohit",
            "Mahendra",
            "Manjunath",
            "Ashish"
    } ;
    String[] standard={
        "2nd A  reg.no: 45",
        "2nd A  reg.no: 46",
        "3rd B  reg.no: 36",
        "3rd B  reg.no: 27",
        "3rd B  reg.no: 35",
        "5th A  reg.no: 19",
        "5th A  reg.no: 39",
        "5th A  reg.no: 42",
        "7th B  reg.no: 33",
        "7th B  reg.no: 35",
        "6th B  reg.no: 03"
    };


    Integer[] imageId = {
            R.drawable.dppic,
            R.drawable.dppic,
            R.drawable.dppic,
            R.drawable.dppic,
            R.drawable.dppic,
            R.drawable.dppic,
            R.drawable.dppic,
            R.drawable.dppic,
            R.drawable.dppic,
            R.drawable.dppic,
            R.drawable.dppic

    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_students, container, false);
        CustomListDirectory adapter = new
                CustomListDirectory(getActivity(), students,standard, imageId);
        list=(ListView)view.findViewById(R.id.students_list);
        list.setAdapter(adapter);

        return view;
    }

    @Override
    public boolean onNavigationItemSelected(int i, long l) {
        return false;
    }
}