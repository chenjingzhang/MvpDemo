package com.dxt2.mvpdemo1;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import com.dxt2.mvpdemo1.adapter.MyAdapter;
import com.dxt2.mvpdemo1.bean.HotData;
import com.dxt2.mvpdemo1.presenter.FirstActivityPresenter;
import com.dxt2.mvpdemo1.view.IFirstActivityView;

public class NetWorkDataMVPActivity extends Activity implements IFirstActivityView{
    FirstActivityPresenter presenter;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_net_work_data_mvp);
        listView = (ListView) findViewById(R.id.listView);
        presenter =new FirstActivityPresenter(this);
        presenter.getListData();
    }

    @Override
    public void setData(HotData hotData) {
     listView.setAdapter(new MyAdapter(hotData.getData(),this));
    }

    @Override
    public void setFailMessage(String error) {
        Log.e("======","=FirstActivity请求失败的原因是====="+error);
    }
}
