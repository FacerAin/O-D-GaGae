package com.example.o_d_gagae;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.Toolbar;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    FragmentManager manager;
    HomeActivity homeActivity;
    CalendarActivity calendarActivity;
    NotifyActivity notifyActivity;
    SettingActivity settingActivity;

    Button btn_home;
    Button btn_calendar;
    Button btn_notify;
    Button btn_setting;
    Toolbar toolbar;
    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        actionBar = getSupportActionBar();
        actionBar.setDisplayShowCustomEnabled(true);
        actionBar.setDisplayShowTitleEnabled(false);
        actionBar.setDisplayHomeAsUpEnabled(true);
         */



        btn_home =findViewById(R.id.btn_home);
        btn_notify = findViewById(R.id.btn_notify);
        btn_calendar = findViewById(R.id.btn_calendar);
        btn_setting = findViewById(R.id.btn_setting);

        btn_home.setOnClickListener(this);
        btn_notify.setOnClickListener(this);
        btn_setting.setOnClickListener(this);
        btn_calendar.setOnClickListener(this);

        manager = getSupportFragmentManager();

        homeActivity = new HomeActivity();
        calendarActivity = new CalendarActivity();
        notifyActivity = new NotifyActivity();
        settingActivity = new SettingActivity();


        FragmentTransaction ft = manager.beginTransaction();
        ft.addToBackStack(null);
        ft.add(R.id.main_container, homeActivity);
        ft.commit();
    }



    @Override
    public void onClick(View v) {
        if(v==btn_home){
            if(!homeActivity.isVisible()) {
                FragmentTransaction ft = manager.beginTransaction();
                ft.addToBackStack(null);
                ft.replace(R.id.main_container, homeActivity);
                ft.commit();
            }
        }
        else if(v==btn_calendar){
            if(!calendarActivity.isVisible()){
                FragmentTransaction ft = manager.beginTransaction();
                ft.addToBackStack(null);
                ft.replace(R.id.main_container, calendarActivity);
                ft.commit();
            }
        }else if(v==btn_notify){
            if(!notifyActivity.isVisible()){
                FragmentTransaction ft = manager.beginTransaction();
                ft.addToBackStack(null);
                ft.replace(R.id.main_container, notifyActivity);
                ft.commit();
            }
        }else if(v==btn_setting){
            if(!settingActivity.isVisible()){
                FragmentTransaction ft = manager.beginTransaction();
                ft.addToBackStack(null);
                ft.replace(R.id.main_container, settingActivity);
                ft.commit();
            }

        }
    }

}
