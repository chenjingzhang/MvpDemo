package com.dxt2.mvp2.model;


import com.dxt2.mvp2.bean.Girl;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/4/24 0024.
 */

public class GrilModelImpl implements IGirlModel{
    @Override
    public void loadGril(final  GirlOnLoadListener listener) {
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    Thread.sleep(2500);//模拟从网络获取数据
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
                List<Girl> girls = new ArrayList<>();
                Girl girl0 = new Girl("ewrw");
                Girl girl1 = new Girl("心如心如最美丽");
                Girl girl2 = new Girl("白富美");
                Girl girl3 = new Girl("天天好心情");
                Girl girl4 = new Girl("眉笑眼开");
                Girl girl5 = new Girl("天天魅力无限");
                Girl girl6 = new Girl("美好的心情开始了");
                Girl girl7 = new Girl("天空飘过一朵云");
                girls.add(girl0);
                girls.add(girl1);
                girls.add(girl2);
                girls.add(girl3);
                girls.add(girl4);
                girls.add(girl5);
                girls.add(girl6);
                girls.add(girl7);
                //调用GirlPresenter里面的onComplete()
                listener.onComplete(girls);
//            }
//        }).start();
    }
}
