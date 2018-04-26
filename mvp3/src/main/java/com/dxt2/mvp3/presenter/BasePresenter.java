package com.dxt2.mvp3.presenter;

import java.lang.ref.WeakReference;

/**
 * Created by Administrator on 2018/4/25 0025.
 */

public class BasePresenter<T> {
    protected WeakReference<T> mViewRef;

    public void attachView(T view) {
        mViewRef = new WeakReference<T>(view);
    }

    public void detachView() {
        if (mViewRef != null) {
            mViewRef.clear();
        }
    }

    protected T getView(){
        return mViewRef.get();
    }
}
