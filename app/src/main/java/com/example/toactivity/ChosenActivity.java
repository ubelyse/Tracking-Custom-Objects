package com.example.toactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;


public class ChosenActivity extends AppCompatActivity {

    @BindView(R.id.locationTextView)  TextView mLocationTextView;
    @BindView(R.id.listView)  ListView mListView;
    //@BindView(R.id.sectionRadioGroup) RadioGroup mrdgrup;
    RadioButton mbtn1,mbtn3;

    private String[] MorningActivities=new String[]{"Stretch","Drink water","Exercise","Eat breakfast","Read a motivational quote","Listen to music","Do a mental puzzle","Get updated on the news","Plan your day","Pack a healthy snack for the day"};
    private String[] MiddayActivities=new String[]{"Eat Lunch"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chosen);
        mbtn1=findViewById(R.id.radioButton1);
        mbtn3=findViewById(R.id.radioButton3);
        ButterKnife.bind(this);

        ListSee();
    }

    private void ListSee() {
        if (mbtn3.isChecked()){
            ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, MorningActivities);
            mListView.setAdapter(adapter);
        }
        else{
            Toast.makeText(this, "No", Toast.LENGTH_SHORT).show();
        }
    }

}