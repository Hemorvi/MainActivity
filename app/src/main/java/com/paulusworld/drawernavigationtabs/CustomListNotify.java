package com.paulusworld.drawernavigationtabs;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomListNotify extends ArrayAdapter<String>{

    private final Activity context;
    private final String[] message;
    private final String[] from;
    public CustomListNotify(Activity context,
                               String[] from, String[] message) {
        super(context, R.layout.list_notify, message);
        this.context = context;
        this.from = from;
        this.message = message;


    }
    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView= inflater.inflate(R.layout.list_notify, null, true);
        TextView txtfrm = (TextView) rowView.findViewById(R.id.txt1);
        TextView txtmsg = (TextView) rowView.findViewById(R.id.txt2);
        txtfrm.setText(from[position]);
        txtmsg.setText(message[position]);
        return rowView;
    }
}