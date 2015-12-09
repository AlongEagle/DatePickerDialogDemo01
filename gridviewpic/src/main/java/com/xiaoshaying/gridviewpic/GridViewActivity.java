package com.xiaoshaying.gridviewpic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GridViewActivity extends AppCompatActivity {
    private GridView gridView;
    private List<Map<String, Object>> dataList;
    private int icon[] = {R.drawable.address_book, R.drawable.calendar,
            R.drawable.camera, R.drawable.clock, R.drawable.games_control,
            R.drawable.messenger, R.drawable.ringtone, R.drawable.settings,
            R.drawable.speech_balloon, R.drawable.weather,
            R.drawable.world, R.drawable.youtube};
    String[] iconName = {"联系人", "日历", "照相机", "时钟", "游戏", "短信", "铃声", "设置",
            "语音", "天气", "浏览器", "Youtube"};


    private SimpleAdapter simpleAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);


        gridView = (GridView) findViewById(R.id.gridView);

        dataList = new ArrayList<>();

        simpleAdapter = new SimpleAdapter(this, getdata(), R.layout.item, new String[]{"image", "text"}
                , new int[]{R.id.image, R.id.text});
        //加载适配器
        gridView.setAdapter(simpleAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(GridViewActivity.this,"我是"+iconName[position],Toast.LENGTH_LONG).show();
            }
        });


    }

    private List<Map<String, Object>> getdata() {
        for (int i=0;i<icon.length;i++){
            Map<String, Object> map=new HashMap<>();
            map.put("image",icon[i]);
            map.put("text",iconName[i]);
            dataList.add(map);
        }

        return dataList;
    }
}
