package com.example.zhuwojia.recycleviewanimation.apiservice;

import com.example.zhuwojia.recycleviewanimation.bean.Pictures;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * Created by zhuwojia on 2016/11/24.
 */

public interface RequestData {

    @POST(value = "v1/post/list")
    @Headers({"Content-Type:application/json; charset=UTF-8"})
    @FormUrlEncoded
    Call<Pictures> getData(@FieldMap Map<String, String> param);
}
