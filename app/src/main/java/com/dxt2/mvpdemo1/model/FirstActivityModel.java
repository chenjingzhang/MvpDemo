package com.dxt2.mvpdemo1.model;

import com.dxt2.mvpdemo1.callback.OnGetDataListener;
import com.dxt2.mvpdemo1.http.HttpUtils;

/**
 * Created by Administrator on 2018/4/19 0019.
 */

public class FirstActivityModel implements IFirstActivityModel{
    OnGetDataListener onGetDataListener;

    public FirstActivityModel(OnGetDataListener onGetDataListener) {
        // this.onGetDataListener 指的是FirstActivityPresenter
        this.onGetDataListener = onGetDataListener;
    }

    @Override
    public void loadData() {
        HttpUtils httpUtils = HttpUtils.getHttpUtils();
        httpUtils.getListData("http://interfaces.ziroom.com/");
        httpUtils.setOnGetDataListener(onGetDataListener);
    }
}




























