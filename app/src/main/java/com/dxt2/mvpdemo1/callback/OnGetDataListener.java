package com.dxt2.mvpdemo1.callback;

import com.dxt2.mvpdemo1.bean.HotData;

/**
 * Created by Administrator on 2018/4/19 0019.
 */

public interface OnGetDataListener {
    void onSuccessGetDataListener(HotData hotData);
    void onFailGetDataListener(String errorMessage);
}
