package com.dxt2.mvp3.presenter;

import com.dxt2.mvp3.bean.Girl;
import com.dxt2.mvp3.model.GirlModelImpl;
import com.dxt2.mvp3.model.IGirlModel;
import com.dxt2.mvp3.view.IGirlView;

import java.lang.ref.WeakReference;
import java.util.List;

/**
 * Created by Administrator on 2018/4/25 0025.
 * 对GrilPresenter3进行优化，(看GrilPresenter4)提取attachView detachView 到BasePresenter<T>
 *
 * GrilPresenter4 extends BasePresenter<IGirlView>
 *
 */

public class GrilPresenter3<T extends IGirlView> {
    private IGirlModel iGirlModel = new GirlModelImpl();
    private WeakReference<T> mViewRef;

    //    public GrilPresenter3(T view) {
//        mViewRef = new WeakReference<T>(view);
//    }
    public GrilPresenter3() {
    }

    public void fetch() {
        if (mViewRef.get() != null) {
            mViewRef.get().loading();
        }
        iGirlModel.loadGirl(new IGirlModel.GirlOnLoadListener() {
            @Override
            public void onComplete(List<Girl> list) {
                IGirlView iGirlView = mViewRef.get();
                if (iGirlView != null) {
                    iGirlView.showGirl(list);
                }
            }
        });
    }

    //如果在20s内，用户又进来了。此时需要做的是在用户退出的时候，在onDetroy()中释放
    public void attachView(T view) {
        mViewRef = new WeakReference<T>(view);
    }

    public void detachView() {
        if (mViewRef != null) {
            mViewRef.clear();
        }
    }
}