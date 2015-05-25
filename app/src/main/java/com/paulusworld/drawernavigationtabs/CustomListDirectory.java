package com.paulusworld.drawernavigationtabs;

 import android.app.Activity;
 import android.view.LayoutInflater;
 import android.view.View;
 import android.view.ViewGroup;
 import android.widget.ArrayAdapter;
 import android.widget.ImageView;
 import android.widget.TextView;

public class CustomListDirectory extends ArrayAdapter<String>{

    private final Activity context;
    private final String[] web;
    private final String[] detail;
    private final Integer[] imageId;
    public CustomListDirectory(Activity context,
                               String[] web,String detail[], Integer[] imageId) {
        super(context, R.layout.list_single, web);
        this.context = context;
        this.detail=detail;
        this.web = web;
        this.imageId = imageId;

    }
    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView= inflater.inflate(R.layout.list_single, null, true);
        TextView txtName = (TextView) rowView.findViewById(R.id.txt);
        TextView txtDetail=(TextView)rowView.findViewById(R.id.detail);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.img);
        txtName.setText(web[position]);
        txtDetail.setText(detail[position]);
        imageView.setImageResource(imageId[position]);
        return rowView;
    }
}