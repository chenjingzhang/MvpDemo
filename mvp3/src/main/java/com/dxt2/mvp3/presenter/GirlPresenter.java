package com.dxt2.mvp3.presenter;

import com.dxt2.mvp3.bean.Girl;
import com.dxt2.mvp3.model.GirlModelImpl;
import com.dxt2.mvp3.model.IGirlModel;
import com.dxt2.mvp3.view.IGirlView;

import java.lang.ref.WeakReference;
import java.util.List;

/**
 * Created by Administrator on 2018/4/25 0025.
 */

public  class GirlPresenter {

    private IGirlModel iGirlModel = new GirlModelImpl();
    private IGirlView iGirlView;
    public GirlPresenter(IGirlView iGirlView) {
        this.iGirlView = iGirlView;
    }
    public void fetch(){
        if(iGirlModel!=null){
            iGirlView.loading();
        }
        iGirlModel.loadGirl(new IGirlModel.GirlOnLoadListener() {
            @Override
            public void onComplete(List<Girl> list) {
                iGirlView.showGirl(list);
            }
        });
    }

}
