package com.example.prince.hsamp6;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    Context context;
    String[] name;
    int[] image;
    LayoutInflater inflater;
    public CustomAdapter(Context context,String[] str,int[] image) {
        this.context = context;
        this.name = str;
        this.image = image;
        inflater = (LayoutInflater.from(context));
    }

    @Override
    public int getCount() {
        return name.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.activity_listview,null);
        ImageView icon= (ImageView)convertView.findViewById(R.id.iconSpace);
        icon.setImageResource(image[position]);
        TextView text = convertView.findViewById(R.id.tvList);
        text.setText(name[position]);
        return convertView;
    }
}
