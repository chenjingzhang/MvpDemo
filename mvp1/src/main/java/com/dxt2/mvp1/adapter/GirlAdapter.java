package com.dxt2.mvp1.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.dxt2.mvp1.R;
import com.dxt2.mvp1.bean.Girl;

import java.util.List;

/**
 * Created by Administrator on 2018/4/24 0024.
 */

public class GirlAdapter extends BaseAdapter{
   private Context context;
   private List<Girl> list;

    public GirlAdapter(List<Girl> list,Context mContext) {
        this.context = mContext;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if(convertView==null){
            holder = new ViewHolder();
            convertView=LayoutInflater.from(context).inflate(R.layout.item_layout,null);
            holder.textView = (TextView) convertView.findViewById(R.id.textView1);
            convertView.setTag(holder);
        }
        else{
            holder = (ViewHolder) convertView.getTag();
        }
        if (list != null && list.size() > 0){
            holder.textView.setText(list.get(i).girlIntroduce);
        }
        return convertView;
    }

    class ViewHolder{
        TextView textView;
    }

}
