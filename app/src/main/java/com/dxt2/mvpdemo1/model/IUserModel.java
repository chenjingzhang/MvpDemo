package com.dxt2.mvpdemo1.model;

import com.dxt2.mvpdemo1.bean.User;

/**
 * Created by Administrator on 2018/4/19 0019.
 */
// IUserModel设置数据(例如：保存用户密码)，读取数据(例如：读取一个用户)
public interface IUserModel {
    void setUserName(String name);
    void setUserPwd(String pwd);
    User load();

}
