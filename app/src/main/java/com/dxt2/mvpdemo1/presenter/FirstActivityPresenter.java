package com.dxt2.mvpdemo1.presenter;

import com.dxt2.mvpdemo1.bean.HotData;
import com.dxt2.mvpdemo1.callback.OnGetDataListener;
import com.dxt2.mvpdemo1.model.FirstActivityModel;
import com.dxt2.mvpdemo1.model.IFirstActivityModel;
import com.dxt2.mvpdemo1.view.IFirstActivityView;

/**
 * Created by Administrator on 2018/4/19 0019.
 */

public class FirstActivityPresenter implements OnGetDataListener{
   IFirstActivityView iFirstActivityView;
   IFirstActivityModel iFirstActivityModel;

    public FirstActivityPresenter(IFirstActivityView iFirstActivityView) {
        this.iFirstActivityView = iFirstActivityView;
        iFirstActivityModel = new FirstActivityModel(this);
    }
    // 使用FirstActivityModel得到数据,交给接口暂存
    // 利用暂存接口将数据给IFirstActivityView进行处理展示
    public void getListData(){
        iFirstActivityModel.loadData();
    }

    //实现OnGetDataListener接口，重写接口中方法
    @Override
    public void onSuccessGetDataListener(HotData hotData) {
        // iFirstActivityView 指的是 NetWorkDataMVPActivity 实际执行的是MainActivity中的setData,setFailMessage方法
        iFirstActivityView.setData(hotData);
    }

    @Override
    public void onFailGetDataListener(String errorMessage) {
        iFirstActivityView.setFailMessage(errorMessage);
    }
}

























