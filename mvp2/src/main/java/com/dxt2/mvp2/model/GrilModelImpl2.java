package com.dxt2.mvp2.model;


import com.dxt2.mvp2.bean.Girl;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/4/24 0024.
 *增加 新的业务模型
 * 方式一：添加model 在preseter处调用model
 * 方式二：添加一个新的presenter,在activity处调用presenter
 * 方式三：只用添加Acitivity,改变view层
 */
//第二种方式 1 添加GrilModelImpl2， 2.在presenter中 调用private IGirlModel iGirlModel = new GrilModelImpl2();
public class GrilModelImpl2 implements IGirlModel {
    @Override
    public void loadGril(final GirlOnLoadListener listener) {
        //模拟从网络获取数据
        new Thread(new Runnable() {
                        @Override
            public void run() {
                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            List<Girl> girls = new ArrayList<>();
            Girl girl0 = new Girl("aaaaa");
            Girl girl1 = new Girl("bbbbb");
            Girl girl2 = new Girl("cccc");
            Girl girl3 = new Girl("dddddd");
            Girl girl4 = new Girl("eeeeee");
            Girl girl5 = new Girl("ffffffff");
            Girl girl6 = new Girl("gggggggg");
            Girl girl7 = new Girl("hhhhhhhh");
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
            }
        }).start();
    }
}
