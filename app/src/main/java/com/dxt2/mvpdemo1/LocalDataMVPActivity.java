package com.dxt2.mvpdemo1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.dxt2.mvpdemo1.presenter.UserPresenter;
import com.dxt2.mvpdemo1.view.IUserView;

public class LocalDataMVPActivity extends Activity implements IUserView{
    EditText et_name;
    EditText et_pwd;

    TextView tv1;
    TextView tv2;

    UserPresenter userPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_local_data_mvp);
        tv1 = (TextView) findViewById(R.id.textView2);
        tv2 = (TextView) findViewById(R.id.textView4);
        et_name= (EditText) findViewById(R.id.editText);
        et_pwd= (EditText) findViewById(R.id.editText2);
        userPresenter = new UserPresenter(this);
    }

    public void write(View view) {
        userPresenter.saveUser(et_name.getText().toString(),et_pwd.getText().toString());
    }

    public void read(View view) {
        userPresenter.loadUser();
    }

    //实现IUserView接口，重写以下两个方法
    @Override
    public void setUserNamee(String name) {
       tv1.setText("用户名是："+name);
    }

    @Override
    public void setUserPwdd(String pwd) {
        tv2.setText("密码是："+pwd);

    }
}
