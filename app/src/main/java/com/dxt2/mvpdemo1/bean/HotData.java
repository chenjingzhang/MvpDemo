package com.dxt2.mvpdemo1.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Administrator on 2018/4/19 0019.
 */

public class HotData {

    /**
     * status : success
     * error : 0
     * data : [{"title":"海燕计划","url":"http://wx.ziroom.com/zyhy/zyhy/m/index.html","320_pic":"http://www.ziroom.com/static/upload/cms/2016/05/c2e43de4405ae6a3e6558a2c46867207.jpg","640_pic":"http://www.ziroom.com/static/upload/cms/2016/05/bff02061296ef4b3d1dacde13acbcdd6.jpg"},{"title":"新品整租","url":"http://www.ziroom.com/zhuanti/zhengzu_fbh/index.html","320_pic":"http://www.ziroom.com/static/upload/cms/2016/06/59be315d8462b7551526e641949f0444.jpg","640_pic":"http://www.ziroom.com/static/upload/cms/2016/06/3aa222c83c68d3b5ec84e6547b2de63d.jpg"},{"title":"自如新品友家","url":"http://www.ziroom.com/zhuanti/youjia_fbh/","320_pic":"http://www.ziroom.com/static/upload/cms/2016/06/30d14d3e32b7a4f6d7ef633a5c27d2aa.jpg","640_pic":"http://www.ziroom.com/static/upload/cms/2016/06/61251253cf49060170f1e97274a106f8.jpg"},{"title":"自如白条","url":"http://www.ziroom.com/zhuanti/zrbaitiao/?utm_source=weixinrefztzrbttwo&utm_medium=weixinref","320_pic":"http://www.ziroom.com/static/upload/cms/2016/06/86562c0ac7eea02b4c1384eb820d7da8.jpg","640_pic":"http://www.ziroom.com/static/upload/cms/2016/06/94504adb7d0985300c4f3cf3f6876989.jpg"},{"title":"自如信用月刊","url":"http://www.ziroom.com/zhuanti/2016/xyyb06/m/index.html","320_pic":"http://www.ziroom.com/static/upload/cms/2016/07/5178a4b75d82bdc988af6c02a4feeea8.jpg","640_pic":"http://www.ziroom.com/static/upload/cms/2016/07/29b8c3857cee8c56a0eb9303539c800a.jpg"},{"title":"送你一台时光穿梭机","url":"http://smshd.ziroom.com/timeTravel/index.html?actCode=2016_time_travel&code=1","320_pic":"http://www.ziroom.com/static/upload/cms/2016/06/39b812fcb0af205b0217f23165787ca9.jpg","640_pic":"http://www.ziroom.com/static/upload/cms/2016/06/b7ce5e91c1b58abb29794c18cac8a565.jpg"}]
     */

    private String status;
    private int error;
    private List<DataBean> data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getError() {
        return error;
    }

    public void setError(int error) {
        this.error = error;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * title : 海燕计划
         * url : http://wx.ziroom.com/zyhy/zyhy/m/index.html
         * 320_pic : http://www.ziroom.com/static/upload/cms/2016/05/c2e43de4405ae6a3e6558a2c46867207.jpg
         * 640_pic : http://www.ziroom.com/static/upload/cms/2016/05/bff02061296ef4b3d1dacde13acbcdd6.jpg
         */

        private String title;
        private String url;
        @SerializedName("320_pic")
        private String _$320_pic;
        @SerializedName("640_pic")
        private String _$640_pic;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String get_$320_pic() {
            return _$320_pic;
        }

        public void set_$320_pic(String _$320_pic) {
            this._$320_pic = _$320_pic;
        }

        public String get_$640_pic() {
            return _$640_pic;
        }

        public void set_$640_pic(String _$640_pic) {
            this._$640_pic = _$640_pic;
        }
    }
}
