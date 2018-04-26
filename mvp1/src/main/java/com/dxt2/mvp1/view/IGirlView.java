package com.dxt2.mvp1.view;

import com.dxt2.mvp1.bean.Girl;

import java.util.List;

/**
 * Created by Administrator on 2018/4/24 0024.
 */

public interface IGirlView {
    //加载的提示
    void loading();
    //显示数据
    void showGirl(List<Girl> girls);
}
