package com.dxt2.mvp2.presenter;


import com.dxt2.mvp2.bean.Girl;
import com.dxt2.mvp2.model.GrilModelImpl;
import com.dxt2.mvp2.model.GrilModelImpl2;
import com.dxt2.mvp2.model.IGirlModel;
import com.dxt2.mvp2.view.IGirlView;

import java.lang.ref.WeakReference;
import java.util.List;

/**
 * Created by Administrator on 2018/4/24 0024.
 */

public class GirlPresenter<T extends IGirlView> {
    //    private IGirlView iGirlView;
    protected WeakReference<T> mViewRef;

    private IGirlModel iGirlModel = new GrilModelImpl();

    //    public GirlPresenter(T view) {
////        this.iGirlView = iGirlView;
//        mViewRef = new WeakReference<T>(view);
//
//    }
    public GirlPresenter() {
    }


    public void fetch() {
        if (iGirlModel != null) {
            //显示进度条
//            if (iGirlView != null) {
//                iGirlView.loading();
//            }
            if (mViewRef.get() != null) {
                mViewRef.get().loading();
            }

            //加载数据
            iGirlModel.loadGril(new IGirlModel.GirlOnLoadListener() {
                @Override
                public void onComplete(List<Girl> girls) {
                    //返回数据，显示到view层
                    //当我们这个线程在不断执行，20s
                    //但在第5秒的时候用户退出了，线程还在执行，等到20s时，activity已经被回收了
//                    mViewRef.get().showGirl(girls);
                    //判断空
                    IGirlView girlView = mViewRef.get();
                    if (girlView != null) {
                        girlView.showGirl(girls);
                    }
                }
            });
        }
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
