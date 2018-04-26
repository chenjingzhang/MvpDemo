package com.dxt2.mvp2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import com.dxt2.mvp2.adapter.GirlAdapter;
import com.dxt2.mvp2.bean.Girl;
import com.dxt2.mvp2.presenter.GirlPresenter;
import com.dxt2.mvp2.presenter.GirlPresenter3;
import com.dxt2.mvp2.view.IGirlView;

import java.util.List;

/**
 * 现在我们模拟的MVP框架，现在V和P之间有关联，P对Activity有引用，并且现在P进行的是耗时操作
 * 假如activity已经按了返回键，退出了，那么p还是有activity引用，没有放弃，那么p所开辟的内存空间没有被GC
 * 那么这样就造成了内存泄漏
 * 解决方案：用弱引用来解决
 * 在内存紧张的时候会回收
 * 软引用：把视图存在软引用里面，当发生gc的时候，会被回收
 */
public class MainActivity extends AppCompatActivity implements IGirlView {
    private ListView listView;
    GirlPresenter girlPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);
//        listView.setAdapter(new GirlAdapter(list,this));
        //方式一 二的调用
//        new GirlPresenter(this).fetch();
//方式三的调用
//        new GirlPresenter(this).fetch();

        girlPresenter = new GirlPresenter<>();
        girlPresenter.attachView(this);
        girlPresenter.fetch();
    }

    @Override
    public void loading() {
        Toast.makeText(MainActivity.this, "rwerwrewr", Toast.LENGTH_LONG).show();
    }

    @Override
    public void showGirl(List<Girl> girls) {
        listView.setAdapter(new GirlAdapter(girls, this));
    }

    //主动回收，把引用置为空
    @Override
    protected void onDestroy() {
        super.onDestroy();
        girlPresenter.detachView();

    }
}
