package com.luckey.messagecenter;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private String[] datas;
    private TabsPagerAdapter tabsPagerAdapter;

    private ViewPager tabsViewpager;
    private TabView tabview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        tabsViewpager = (ViewPager) findViewById(R.id.news_viewpager);
        tabview = (TabView) findViewById(R.id.tabview);
        datas = new String[]{"安防","车况","服务"};
        tabview.setTabs(datas);
        tabsPagerAdapter = new TabsPagerAdapter(getSupportFragmentManager(),datas);
        tabsViewpager.setAdapter(tabsPagerAdapter);
        tabview.setViewPager(tabsViewpager);
    }
}
