package com.res.syh.yongheshen.androidresource;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.TabHost;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        initTab();
    }

//    private void initTab(){
//        // 获取TabHost对象
//        TabHost tabHost = (TabHost) findViewById(R.id.tabHost);
//        // 如果没有继承TabActivity时，通过该种方法加载启动tabHost
//        tabHost.setup();
//        tabHost.addTab(tabHost.newTabSpec("tab1").setIndicator("第一个标签").setContent(
//                R.id.tab1));
//
//        tabHost.addTab(tabHost.newTabSpec("tab3").setIndicator("第三个标签")
//                .setContent(R.id.tab2));
//
//        tabHost.addTab(tabHost.newTabSpec("tab2").setIndicator("第二个标签")
//                .setContent(R.id.tab3));
//    }
}
