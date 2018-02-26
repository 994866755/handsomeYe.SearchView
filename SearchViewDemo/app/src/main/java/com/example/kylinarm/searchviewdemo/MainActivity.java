package com.example.kylinarm.searchviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.kylinarm.searchviewdemo.components.view.seach.KylinSearchView;
import com.example.kylinarm.searchviewdemo.components.view.seach.OnSearchListener;

public class MainActivity extends AppCompatActivity implements OnSearchListener{

    private KylinSearchView searchViewDemo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        searchViewDemo = (KylinSearchView) findViewById(R.id.sv_default);
        searchViewDemo.setOnSearchListener(this);
    }

    @Override
    public void search(String content) {
        Toast.makeText(this,"搜索内容： "+content,Toast.LENGTH_SHORT).show();
    }

}
