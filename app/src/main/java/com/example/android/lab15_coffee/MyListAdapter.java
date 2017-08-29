package com.example.android.lab15_coffee;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by android on 2017/8/29.
 */

public class MyListAdapter extends BaseAdapter {
    private MainActivity mainActivity;
    public MyListAdapter(MainActivity mainActivity){
        this.mainActivity = mainActivity;
    }

    @Override
    public int getCount() {
        return mainActivity.getmCoffeeList().size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View covnertView, ViewGroup parent) {
        View v = mainActivity.getLayoutInflater().inflate(R.layout.listview_layout,null);
        TextView tvItemId = (TextView)v.findViewById(R.id.itemId);
        TextView tvItemTitle = (TextView)v.findViewById(R.id.itemTitle);
        TextView tvItemPrice = (TextView)v.findViewById(R.id.itemPrice);
        ImageView iv_ItemImage = (ImageView)v.findViewById(R.id.itemImage);

        Coffee coffee = mainActivity.getmCoffeeList().get(position);

        tvItemId.setText("id");
        tvItemPrice.setText(String.valueOf(coffee.getPrice()));
        tvItemTitle.setText(coffee.getTitle());
        iv_ItemImage.setImageResource(coffee.getImg_resource_id());
        return v;
    }
}
