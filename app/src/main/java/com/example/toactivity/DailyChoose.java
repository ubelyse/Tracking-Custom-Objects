package com.example.toactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DailyChoose extends AppCompatActivity {
    @BindView(R.id.sectionRadioGroup) RadioGroup mrdgrup;
    @BindView(R.id.radioButton1) RadioButton mbtn1;
    @BindView(R.id.radioButton2) RadioButton mbtn2;
    @BindView(R.id.radioButton3) RadioButton mbtn3;

    @BindView(R.id.submitButton) Button msubmit;
    @BindView(R.id.cancelButton) Button mcancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_choose);
        ButterKnife.bind(this);

        mcancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        msubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mbtn1.isChecked()) {
                    Intent intent = new Intent(DailyChoose.this, ChosenActivity.class);
                    startActivity(intent);
                }
                else if(mbtn2.isChecked()){
                    Intent intent = new Intent(DailyChoose.this, ChoseMidDay.class);
                    startActivity(intent);
                }

                else if(mbtn3.isChecked()){
                    Intent intent = new Intent(DailyChoose.this, ChoseAfternoon.class);
                    startActivity(intent);
                }

            }
        });
    }
}