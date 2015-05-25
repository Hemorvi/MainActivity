package com.paulusworld.drawernavigationtabs;



import android.app.ActionBar;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class TeachersFragment extends Fragment implements ActionBar.OnNavigationListener {

    ListView list;
    String[] teachers = {
            "Ravikumar",
            "Kariyappa",
            "Triveni",
            "Raghu",
            "Ranganath",
            "Kalashree",
            "Divya",
            "Chandrappa",
            "Rajshekar",
            "Chandru",
            "Sundari"
    } ;

String[] details={"Maths","Sports","science","sports","kannada","english","maths","drawing","social","geometry","hindi"};
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

        View view = inflater.inflate(R.layout.fragment_teachers, container, false);
        CustomListDirectory adapter = new
                CustomListDirectory(getActivity(), teachers,details,imageId);
        list=(ListView)view.findViewById(R.id.teachers_list);
        list.setAdapter(adapter);

        return view;
    }

    @Override
    public boolean onNavigationItemSelected(int i, long l) {
        return false;
    }
}