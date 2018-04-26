package com.dxt2.mvp3.model;

import com.dxt2.mvp3.bean.Girl;

import java.util.List;

/**
 * Created by Administrator on 2018/4/25 0025.
 */

public interface IGirlModel {
    void loadGirl(GirlOnLoadListener listener);

    interface  GirlOnLoadListener{
        void onComplete(List<Girl> list);
    }
}
