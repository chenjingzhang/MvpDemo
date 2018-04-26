package com.dxt2.mvp3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import com.dxt2.mvp3.adapter.GirlAdapter;
import com.dxt2.mvp3.bean.Girl;
import com.dxt2.mvp3.presenter.BasePresenter;
import com.dxt2.mvp3.presenter.GirlPresenter;
import com.dxt2.mvp3.presenter.GrilPresenter2;
import com.dxt2.mvp3.presenter.GrilPresenter3;
import com.dxt2.mvp3.presenter.GrilPresenter4;
import com.dxt2.mvp3.view.IGirlView;

import java.util.List;

public class MainActivity extends BaseActivity<IGirlView,GrilPresenter4> implements IGirlView {
    private ListView listView;
//    GrilPresenter3 grilPresenter3;
//GrilPresenter4 grilPresenter4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);
        //以下三种无需改MainActivity
//        new GirlPresenter(this).fetch();
        //new GrilPresenter2<>(this).fetch();
        //zhushi3
//        grilPresenter3 = new GrilPresenter3<>();
//        grilPresenter3.attachView(this);
//        grilPresenter3.fetch();

        grilPresenter4.fetch();
        //这块的presenter可以有多个


    }

//    @Override
//    protected BasePresenter createPresenter() {
//        return new GrilPresenter4();
//    }

        @Override
    protected GrilPresenter4 createPresenter() {
        return new GrilPresenter4();
    }
    @Override
    public void loading() {
        Toast.makeText(this, "fdsfsfd", Toast.LENGTH_LONG).show();
    }

    @Override
    public void showGirl(List<Girl> list) {
        listView.setAdapter(new GirlAdapter(list, this));
    }

    ///主动回收，把引用置为空
    //   //zhushi3
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        grilPresenter3.detachView();
//    }
}
