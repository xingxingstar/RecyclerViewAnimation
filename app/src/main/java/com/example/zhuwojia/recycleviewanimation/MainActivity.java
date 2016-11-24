package com.example.zhuwojia.recycleviewanimation;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.zhuwojia.recycleviewanimation.adapter.RecyclerViewAdapter;
import com.example.zhuwojia.recycleviewanimation.apiservice.RequestData;
import com.example.zhuwojia.recycleviewanimation.bean.Pictures;

import java.util.HashMap;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        downBean();
    }

    private void downBean() {
        HashMap<String, String> map = setHashMap();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://api.menghuoapp.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        RequestData requestData = retrofit.create(RequestData.class);
        Call<Pictures> data = requestData.getData(map);
        data.enqueue(new Callback<Pictures>() {
            @Override
            public void onResponse(Call<Pictures> call, Response<Pictures> response) {
                List<Pictures.DataBean> data = response.body().getData();
                LinearLayoutManager manager = new LinearLayoutManager(MainActivity.this);
                recyclerView.setLayoutManager(manager);
                recyclerView.setAdapter(new RecyclerViewAdapter(MainActivity.this, data));
            }

            @Override
            public void onFailure(Call<Pictures> call, Throwable t) {

            }
        });
    }

    /**
     * 设置map
     *
     * @return
     */
    @NonNull
    private HashMap<String, String> setHashMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("orider_dir", "1");
        map.put("page_size", "20");
        map.put("page", "0");
        map.put("order_by", "1");
        return map;
    }
}
