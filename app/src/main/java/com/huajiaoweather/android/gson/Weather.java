package com.huajiaoweather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by YuYang on 2018/4/3 0003.
 */

public class Weather {
    public String status;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;


}
