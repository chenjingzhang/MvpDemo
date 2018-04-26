package com.dxt2.mvp3.presenter;

import com.dxt2.mvp3.bean.Girl;
import com.dxt2.mvp3.model.GirlModelImpl;
import com.dxt2.mvp3.model.IGirlModel;
import com.dxt2.mvp3.view.IGirlView;

import java.lang.ref.WeakReference;
import java.util.List;

/**
 * Created by Administrator on 2018/4/25 0025.
 * 发生内存泄漏，使用弱引用
 * 使用以下的弱引用，引起问题（如果model请求数据需要20s,在第5秒的时候，用户点击了返回键，会造成内存泄漏；
 * 如果在第6秒的时候用户又进去了，会有未知问题。所以要在用户点击返回键的时候，进行回收处理。看GrilPresenter3
 * ）
 */

public class GrilPresenter2<T extends IGirlView> {
    private IGirlModel iGirlModel = new GirlModelImpl();
    //    private IGirlView iGirlView;
//    public GrilPresenter2(IGirlView iGirlView) {
//        this.iGirlView = iGirlView;
//    }
    protected WeakReference<T> mViewRef;

    public GrilPresenter2(T view) {
        mViewRef = new WeakReference<T>(view);
    }

    public void fetch() {
//        if(iGirlModel!=null){
//            iGirlView.loading();
//        }
        if (mViewRef.get() != null) {
            mViewRef.get().loading();
        }
        iGirlModel.loadGirl(new IGirlModel.GirlOnLoadListener() {
            @Override
            public void onComplete(List<Girl> list) {
//                iGirlView.showGirl(list);
                //判断空
                // 返回数据，显示到view层
                //当我们这个线程在不断执行，20s
                //但在第5秒的时候用户退出了，线程还在执行，等到20s时，activity已经被回收了,发生内存泄漏，需要优化，在点击返回键的时候，回收掉view
                IGirlView iGirlView = mViewRef.get();
                if (iGirlView != null) {
                    iGirlView.showGirl(list);
                }
            }
        });
    }
}
