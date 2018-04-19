package com.dxt2.mvpdemo1.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.dxt2.mvpdemo1.bean.HotData;

import java.util.List;

/**
 * Created by Administrator on 2018/4/19 0019.
 */

public class MyAdapter extends BaseAdapter{
    List<HotData.DataBean> dataBeanList;
    Context context;

    public MyAdapter(List<HotData.DataBean> dataBeanList, Context context) {
        this.dataBeanList = dataBeanList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return dataBeanList.size();
    }

    @Override
    public Object getItem(int i) {
        return dataBeanList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView imageView =new ImageView(context);
        Glide.with(context).load(dataBeanList.get(i).get_$640_pic())
                .into(imageView);
        return imageView;
    }
}
