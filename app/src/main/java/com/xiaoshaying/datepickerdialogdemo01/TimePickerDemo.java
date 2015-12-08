package com.xiaoshaying.datepickerdialogdemo01;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TimePicker;

import java.util.Calendar;

public class TimePickerDemo extends AppCompatActivity {

    private TimePicker timePicker;
    private Calendar calendar;

    private int hour;
    private int minute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.timepickerdemo);

        calendar=Calendar.getInstance();
        hour=calendar.get(Calendar.HOUR_OF_DAY);
        minute=calendar.get(Calendar.MINUTE);

        timePicker= (TimePicker) findViewById(R.id.timePicker);
        timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
                setTitle(hourOfDay+" : "+minute);
            }
        });

    }
}
