package com.huajiaoweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by YuYang on 2018/4/5 0005.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{

        @SerializedName("loc")
        public String updateTime;
    }

}
