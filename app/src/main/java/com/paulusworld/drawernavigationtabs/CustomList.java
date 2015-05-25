package com.paulusworld.drawernavigationtabs;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by Hemorvi Champaneria on 23-05-2015.
 */
public class CustomList extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] web;

    public CustomList(Activity context,
                      String[] web) {
        super(context, R.layout.list_item, web);
        this.context = context;
        this.web = web;


    }
    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView= inflater.inflate(R.layout.list_item, null, true);
        TextView txtName = (TextView) rowView.findViewById(R.id.txt);

        txtName.setText(web[position]);
        return rowView;
    }
}