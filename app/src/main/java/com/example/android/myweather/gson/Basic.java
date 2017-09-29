package com.example.android.myweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by android on 17-9-26.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;
    }
}
