package com.dxt2.mvp3.model;

import com.dxt2.mvp3.bean.Girl;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/4/25 0025.
 */

public class GirlModelImpl implements IGirlModel{
    @Override
    public void loadGirl(GirlOnLoadListener listener) {
        List<Girl> girls = new ArrayList<>();
        Girl girl0 = new Girl("ewrw");
        Girl girl1 = new Girl("3333333");
        Girl girl2 = new Girl("4444444");
        Girl girl3 = new Girl("5555555");
        Girl girl4 = new Girl("666666");
        Girl girl5 = new Girl("777777");
        Girl girl6 = new Girl("888");
        girls.add(girl0);
        girls.add(girl1);
        girls.add(girl2);
        girls.add(girl3);
        girls.add(girl4);
        girls.add(girl5);
        girls.add(girl6);
        //调用GirlPresenter里面的onComplete()
        listener.onComplete(girls);
    }
}
