package com.dxt2.mvp1.presenter;

import com.dxt2.mvp1.bean.Girl;
import com.dxt2.mvp1.model.GrilModelImpl2;
import com.dxt2.mvp1.model.IGirlModel;
import com.dxt2.mvp1.view.IGirlView;

import java.util.List;

/**
 * Created by Administrator on 2018/4/24 0024.
 */
//方式三：创建一个新的presenter
public class GirlPresenter3 {
    private IGirlView iGirlView;
    //  private IGirlModel iGirlModel = new GrilModelImpl();
    private IGirlModel iGirlModel = new GrilModelImpl2();
    public GirlPresenter3(IGirlView iGirlView) {
        this.iGirlView = iGirlView;
    }

    public void fetch() {
        if (iGirlModel != null) {
            //显示进度条
            if (iGirlView != null) {
                iGirlView.loading();
            }

            //加载数据
            iGirlModel.loadGril(new IGirlModel.GirlOnLoadListener() {
                @Override
                public void onComplete(List<Girl> girls) {
                    //返回数据，显示到view层
                    iGirlView.showGirl(girls);
                }
            });
        }
    }

}
