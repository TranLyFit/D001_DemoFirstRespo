package com.example.tran_ly.listview2;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdaptorLstv extends BaseAdapter {
    private Context context;
    private ArrayList<ContactModel> arr;

    public CustomAdaptorLstv (Context context, ArrayList<ContactModel> arr){
        this.context=context;
        this.arr=arr;
    }

    @Override
    public int getCount() {
        return arr.size();
    }

    @Override
    public Object getItem(int position) {
        return arr.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = ((Activity) context).getLayoutInflater();
        View row = inflater.inflate(R.layout.customlistview, null);

        ImageView imgv1= row.findViewById(R.id.img1);
        TextView tvName= row.findViewById(R.id.tvName);
        TextView tvPhone =  row.findViewById(R.id.tvPhone);
        ImageView imgv2 = row.findViewById(R.id.img2);

        imgv1.setImageResource(arr.get(position).getidImg1());
        tvName.setText(arr.get(position).getName());
        tvPhone.setText(arr.get(position).getPhone());
        imgv2.setImageResource(arr.get(position).getidImg2());


        return row;
    }
}


