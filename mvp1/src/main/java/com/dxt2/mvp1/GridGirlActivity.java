package com.dxt2.mvp1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

import com.dxt2.mvp1.adapter.GirlAdapter;
import com.dxt2.mvp1.bean.Girl;
import com.dxt2.mvp1.presenter.GirlPresenter3;
import com.dxt2.mvp1.view.IGirlView;

import java.util.List;

public class GridGirlActivity extends AppCompatActivity implements IGirlView {
    private GridView gridView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_girl);
        gridView = findViewById(R.id.gridView);
//        listView.setAdapter(new GirlAdapter(list,this));
        //方式一 二的调用
//        new GirlPresenter(this).fetch();
        //方式三的调用
        new GirlPresenter3(this).fetch();
    }

    //实现IGirlView,重写里面的方法
    @Override
    public void loading() {
        Toast.makeText(GridGirlActivity.this, "rwerwrewr", Toast.LENGTH_LONG).show();
    }

    @Override
    public void showGirl(List<Girl> girls) {
        gridView.setAdapter(new GirlAdapter(girls, this));
    }
}
