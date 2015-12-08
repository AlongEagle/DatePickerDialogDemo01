package com.xiaoshaying.gridviewpic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class GridViewActivity extends AppCompatActivity {
    private GridView gridView;
    private List<Map<String,Objects>> dataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);




        gridView= (GridView) findViewById(R.id.gridView);

        dataList=new ArrayList<Map<String,Objects>>();

    }
}
