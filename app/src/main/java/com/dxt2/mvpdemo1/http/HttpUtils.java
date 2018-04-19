package com.dxt2.mvpdemo1.http;

import com.dxt2.mvpdemo1.bean.HotData;
import com.dxt2.mvpdemo1.callback.GetData;
import com.dxt2.mvpdemo1.callback.OnGetDataListener;
import com.google.gson.Gson;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

/**
 * Created by Administrator on 2018/4/19 0019.
 */

public class HttpUtils {
    private static HttpUtils httpUtils = null;
    OnGetDataListener onGetDataListener;
    public static HttpUtils getHttpUtils(){
        if(httpUtils == null){
            httpUtils = new HttpUtils();
        }
        return httpUtils;
    }

    public void setOnGetDataListener(OnGetDataListener onGetDataListener) {
        this.onGetDataListener = onGetDataListener;
    }

    public void getListData(String url){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        GetData data = retrofit.create(GetData.class);
        Call<HotData> call = data.getHotListData();
        call.enqueue(new Callback<HotData>() {
            @Override
            public void onResponse(Call<HotData> call, Response<HotData> response) {
                HotData hotData = response.body();
                if(onGetDataListener!=null){
                    //回调的是FirstActivityPresenter中的onSuccessGetDataListener方法
                    onGetDataListener.onSuccessGetDataListener(hotData);
                }
            }

            @Override
            public void onFailure(Call<HotData> call, Throwable t) {
               if(onGetDataListener!=null){
                   onGetDataListener.onFailGetDataListener(t.getMessage());
               }
            }
        });
    }

}




























