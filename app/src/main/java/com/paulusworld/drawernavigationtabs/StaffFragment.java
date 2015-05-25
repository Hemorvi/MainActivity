package com.paulusworld.drawernavigationtabs;


import android.app.ActionBar;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class StaffFragment extends Fragment implements ActionBar.OnNavigationListener {

    ListView list;
    String[] staff = {
            "Swaminathan",
            "Narayan",
            "Pavan",
            "Sridevi",
            "Vani",
            "John Varty",
            "Chandrashekar",
            "Raju",
            "Rajesh",
            "Aparna",
            "Suresh"
    } ;

    String[] details={"Accounts Manager","teacher","teacher","teacher","teacher","sports teacher","principal","teacher","Attender","teacher","teacher"};

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

        View view = inflater.inflate(R.layout.fragment_staff, container, false);
        CustomListDirectory adapter = new
                CustomListDirectory(getActivity(), staff,details, imageId);
        list=(ListView)view.findViewById(R.id.staff_list);
        list.setAdapter(adapter);

        return view;
    }

    @Override
    public boolean onNavigationItemSelected(int i, long l) {
        return false;
    }
}