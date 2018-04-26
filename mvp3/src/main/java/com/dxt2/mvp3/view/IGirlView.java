package com.dxt2.mvp3.view;

import com.dxt2.mvp3.bean.Girl;

import java.util.List;

/**
 * Created by Administrator on 2018/4/25 0025.
 */

public interface IGirlView {
    void loading();
    void showGirl(List<Girl> list);
}
