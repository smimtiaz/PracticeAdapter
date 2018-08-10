package com.example.imtia.countrycustomadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CustomAdapter extends BaseAdapter {

    Context context;
    LayoutInflater inflater;

    List<CountryData> countryData;

    CustomAdapter(Context context,List<CountryData> countryData) {

        this.countryData = countryData;
        this.context = context;
    }

    @Override
    public int getCount() {
        return countryData.size();
    }

    @Override
    public Object getItem(int i) {
        return countryData.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {

        inflater = LayoutInflater.from(context);

        convertView = inflater.inflate(R.layout.sample_view, viewGroup,false);

        ImageView imageview = convertView.findViewById(R.id.imageViewId);
        TextView textView = convertView.findViewById(R.id.textView1);

        imageview.setImageResource(countryData.get(position).getFlagID());
        textView.setText(countryData.get(position).getCountryName().toString());

        return convertView;
    }
}