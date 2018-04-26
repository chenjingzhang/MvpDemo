package com.dxt2.mvp3.presenter;

import android.widget.BaseAdapter;

import com.dxt2.mvp3.bean.Girl;
import com.dxt2.mvp3.model.GirlModelImpl;
import com.dxt2.mvp3.model.IGirlModel;
import com.dxt2.mvp3.view.IGirlView;

import java.lang.ref.WeakReference;
import java.util.List;

/**
 * Created by Administrator on 2018/4/25 0025.
 */

public class GrilPresenter4 extends BasePresenter<IGirlView> {
    private IGirlModel iGirlModel = new GirlModelImpl();

    public GrilPresenter4() {
    }

    public void fetch() {
        if (getView() != null) {
            getView().loading();
        }
        iGirlModel.loadGirl(new IGirlModel.GirlOnLoadListener() {
            @Override
            public void onComplete(List<Girl> list) {
                IGirlView iGirlView = getView();
                if (iGirlView != null) {
                    iGirlView.showGirl(list);
                }
            }
        });
    }


}
