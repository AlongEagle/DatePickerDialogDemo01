package com.xiaoshaying.datepickerdialogdemo01;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.TimePicker;

import java.util.Calendar;

public class DatePickerDemo extends AppCompatActivity {

    private TimePicker timePicker;
    private DatePicker datePicker;



    private DatePickerDialog datePickerDialog;
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

        //显示对话框模式的日期选择窗口  记得最后要show()一下 否则无法显示



        /**
         * @param context 上下文
         * @param callBack 选择日期后的回掉回掉函数.
         * @param year The initial year of the dialog.   打开时显示的年份
         * @param monthOfYear The initial month of the dialog.  打开时显示的月份
         * @param dayOfMonth The initial day of the dialog.

        public DatePickerDialog(Context context,
                OnDateSetListener callBack,
        int year,
        int monthOfYear,
        int dayOfMonth) {
            this(context, 0, callBack, year, monthOfYear, dayOfMonth);
        }
        */


//        new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
//            @Override
//            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
//                setTitle("窗口"+year + "年" + monthOfYear + "月" + dayOfMonth+"日");
//            }
//        },year,month,day).show();








// //显示对话框模式的时间选择窗口  记得最后要show()一下 否则无法显示

        /**
         * Creates a new time picker dialog.
         *
         * @param context the parent context
         * @param listener the listener to call when the time is set
         * @param hourOfDay the initial hour
         * @param minute the initial minute
         * @param is24HourView whether this is a 24 hour view or AM/PM

        public TimePickerDialog(Context context, OnTimeSetListener listener, int hourOfDay, int minute,
        boolean is24HourView) {
            this(context, 0, listener, hourOfDay, minute, is24HourView);
        }*/


        new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                setTitle("窗口"+hourOfDay + "时" + minute + "分");
            }
        },hour,minute,true).show();



    }
}
