package com.example.toactivity;

import android.widget.ArrayAdapter;

public class ChoseMidDay  extends ChosenActivity{
    ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, MorningActivities);
        mListView.setAdapter(adapter);
}
