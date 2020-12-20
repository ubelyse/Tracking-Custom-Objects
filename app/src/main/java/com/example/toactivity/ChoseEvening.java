package com.example.toactivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ChoseEvening extends ChosenActivity{

    @BindView(R.id.locationTextView)
    TextView mLocationTextView;
    @BindView(R.id.listView)
    ListView mListView;
    private String[] EveningActivities=new String[]{"Extend your date with art and architecture","Tour the city by night.","Shop for bargains","Flex your muscles after sundown","Hunt down late night eateries","Sit back and watch","Take Evening Dinner","Read Your Bible","Pray"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chosen);
        ButterKnife.bind(this);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, EveningActivities);
        mListView.setAdapter(adapter);

    }
}
