package com.dxt2.mvp3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.dxt2.mvp3.bean.Girl;
import com.dxt2.mvp3.presenter.BasePresenter;
import com.dxt2.mvp3.presenter.GrilPresenter4;
import com.dxt2.mvp3.view.IGirlView;

import java.util.List;

public abstract class BaseActivity<V,T extends BasePresenter<V>> extends AppCompatActivity {
//    public GrilPresenter4<IGirlView> girlViewGrilPresenter4;
    public T grilPresenter4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
        grilPresenter4 =createPresenter();
        grilPresenter4.attachView((V)this);
//        grilPresenter4.fetch();
    }
    protected abstract T createPresenter();

    protected void onDestroy() {
        super.onDestroy();
        grilPresenter4.detachView();
    }
}
