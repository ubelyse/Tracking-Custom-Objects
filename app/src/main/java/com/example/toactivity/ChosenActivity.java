package com.example.toactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ChosenActivity extends AppCompatActivity {

    @BindView(R.id.locationTextView)  TextView mLocationTextView;
    @BindView(R.id.listView)  ListView mListView;
    @BindView(R.id.sectionRadioGroup) RadioGroup mrdgrup;

    private String[] MorningActivities=new String[]{"Stretch","Drink water","Exercise","Eat breakfast","Read a motivational quote","Listen to music","Do a mental puzzle","Get updated on the news","Plan your day","Pack a healthy snack for the day"};
    private String[] MiddayActivities=new String[]{};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chosen);
        ButterKnife.bind(this);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, MorningActivities);
        ArrayAdapter adapter1=new ArrayAdapter(this, android.R.layout.simple_list_item_1,MiddayActivities);

        mListView.setAdapter(adapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String restaurant = ((TextView)view).getText().toString();
                Toast.makeText(ChosenActivity.this, restaurant, Toast.LENGTH_LONG).show();
            }
        });

        Intent intent = getIntent();
        String location = intent.getStringExtra("location");

        mLocationTextView.setText("Here are all the restaurants near: " + location);

    }
}