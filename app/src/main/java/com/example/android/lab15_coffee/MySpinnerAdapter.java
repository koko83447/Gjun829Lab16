package com.example.android.lab15_coffee;


import android.app.Activity;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class MySpinnerAdapter extends BaseAdapter {

    private static final String TAG = "MySpinnerAdapter";
    private Activity activity;
    private TypedArray coffee_titles;
    private TypedArray coffee_drawables;
    private int[] img_resource_id_array = {
            R.drawable.coffee_cappuccino,
            R.drawable.coffee_latte,
            R.drawable.coffee_macchiato,
            R.drawable.coffee_mocha,
    };

    public MySpinnerAdapter(Activity activity) {
        this.activity = activity;

        Resources resources = activity.getResources();
        coffee_titles = resources.obtainTypedArray(R.array.coffee_title);
        coffee_drawables = resources.obtainTypedArray(R.array.coffee_drawables);
    }

    @Override
    public int getCount() {
        return 4;
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
    public View getView(int i, View view, ViewGroup viewGroup) {
        String message = "getView() 第幾項 = " + i + "咖啡名稱 = " + coffee_titles.getText(i);
        Log.d(TAG, message);

        View v = activity.getLayoutInflater().inflate(R.layout.spinner_layout, null);
        TextView tv = (TextView) v.findViewById(R.id.coffee_title);
        tv.setText(coffee_titles.getText(i));

        ImageView iv = (ImageView) v.findViewById(R.id.coffee_drawable);
        iv.setImageDrawable(coffee_drawables.getDrawable(i));

        return v;
    }

    public TypedArray getCoffee_titles(){
        return coffee_titles;
    }
    public int[] getImg_resource_id_array(){
        return img_resource_id_array;
    }
}
