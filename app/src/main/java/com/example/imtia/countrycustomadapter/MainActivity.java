package com.example.imtia.countrycustomadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import static com.example.imtia.countrycustomadapter.R.id.listviewId;

public class MainActivity extends AppCompatActivity {

    ListView listview;

    List<CountryData> countryData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listview = findViewById(R.id.listviewId);

        initArray();

        CustomAdapter adapter = new CustomAdapter(this, countryData);
        listview.setAdapter(adapter);
    }

    public void initArray() {

        countryData = new ArrayList<>();

        countryData.add(new CountryData("Canada", R.drawable.canada));
        countryData.add(new CountryData("Japan", R.drawable.japan));
        countryData.add(new CountryData("Bangladesh", R.drawable.bangladesh));
    }
}
