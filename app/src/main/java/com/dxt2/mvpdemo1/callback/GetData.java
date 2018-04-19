package com.dxt2.mvpdemo1.callback;

import com.dxt2.mvpdemo1.bean.HotData;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

/**
 * Created by Administrator on 2018/4/19 0019.
 */

public interface GetData {
    @Headers({"User-Agent: Apache-HttpClient/UNAVAILABLE (java 1.4)"})
    @GET(value ="index.php?_p=api&_a=carousel")
    Call<HotData> getHotListData();
}
