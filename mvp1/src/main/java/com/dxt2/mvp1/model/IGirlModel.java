package com.dxt2.mvp1.model;

import com.dxt2.mvp1.bean.Girl;

import java.util.List;

/**
 * Created by Administrator on 2018/4/24 0024.
 */

public interface IGirlModel {
    void loadGril(GirlOnLoadListener listener);

    //接口设计，回调返回数据
    interface GirlOnLoadListener {
        void onComplete(List<Girl> girls);
    }
}
