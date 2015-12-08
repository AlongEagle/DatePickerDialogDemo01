package com.xiaoshaying.datepickerdialogdemo01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.TimePicker;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    private TimePicker timePicker;
    private DatePicker datePicker;
    private Calendar calendar;

    private int year;
    private int month;
    private int day;
    private int hour;
    private int minute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calendar=Calendar.getInstance();
        year=calendar.get(Calendar.YEAR);
        month=calendar.get(Calendar.MONTH)+1;
        day=calendar.get(Calendar.DAY_OF_WEEK);
        hour=calendar.get(Calendar.HOUR_OF_DAY);
        minute=calendar.get(Calendar.MINUTE);

//        setTitle(year+"年"+month+"月"+day+"日"+hour+"时");
        datePicker= (DatePicker) findViewById(R.id.datePicker);

        datePicker.init(year, month, day, new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                System.out.println("innnnnnnnnnnnnnnnnn,,,,,,,,,,,,,-------------------------------------------");
                setTitle(year + "年" + monthOfYear + "月" + dayOfMonth+"日");
            }
        });

    }
}
