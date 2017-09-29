package com.example.android.myweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by android on 17-9-26.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{

        @SerializedName("txt")
        public String info;
    }
}
