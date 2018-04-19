package com.dxt2.mvpdemo1.model;

import com.dxt2.mvpdemo1.bean.User;

/**
 * Created by Administrator on 2018/4/19 0019.
 */

public class UserModel implements IUserModel{
    String mName;
    String mPwd;
    @Override
    public void setUserName(String name) {
        mName = name;
    }

    @Override
    public void setUserPwd(String pwd) {
       mPwd = pwd;
    }

    @Override
    public User load() {
        return new User(mName,mPwd);
    }
}
