package com.dxt2.mvp1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import com.dxt2.mvp1.adapter.GirlAdapter;
import com.dxt2.mvp1.bean.Girl;
import com.dxt2.mvp1.presenter.GirlPresenter3;
import com.dxt2.mvp1.view.IGirlView;

import java.util.List;

public class MainActivity extends AppCompatActivity implements IGirlView {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);
//        listView.setAdapter(new GirlAdapter(list,this));
        //方式一 二的调用
//        new GirlPresenter(this).fetch();
//方式三的调用
        new GirlPresenter3(this).fetch();
    }

    //实现IGirlView,重写里面的方法
    @Override
    public void loading() {
        Toast.makeText(MainActivity.this, "rwerwrewr", Toast.LENGTH_LONG).show();
    }

    @Override
    public void showGirl(List<Girl> girls) {
        listView.setAdapter(new GirlAdapter(girls, this));
    }
}
