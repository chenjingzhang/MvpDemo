package com.dxt2.mvpdemo1.presenter;

import com.dxt2.mvpdemo1.bean.User;
import com.dxt2.mvpdemo1.model.IUserModel;
import com.dxt2.mvpdemo1.model.UserModel;
import com.dxt2.mvpdemo1.view.IUserView;

/**
 * Created by Administrator on 2018/4/19 0019.
 */

public class UserPresenter {
    private IUserModel iUserModel;
    private IUserView iUserView;

    public UserPresenter(IUserView iUserView) {
        this.iUserView = iUserView;
        iUserModel = new UserModel();
    }
    //IUserModel UserModel:设置数据(例如：保存用户密码)，
    //使用UserModel保存,利用UserModel取出数据给IUserView
    public void saveUser(String name,String pwd){
        iUserModel.setUserName(name);
        iUserModel.setUserPwd(pwd);
    }
    public void loadUser(){
        User user = iUserModel.load();//// 读取数据(例如：读取一个用户),此时User里面已经有数据（先saveUser（写），再loadUser(读)）
        //接口回调，实际调用的是LocalDataMVPActivity中的setUserNamee setUserPwdd 方法
        iUserView.setUserNamee(user.getName());
        iUserView.setUserPwdd(user.getPwd());
    }
}




















