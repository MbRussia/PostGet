package com.example.postget;


import com.example.postget.pojo.Analog;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MyCallBack implements Callback<Analog> {
    @Override
    public void onResponse(Call<Analog> call, Response<Analog> response) {

    }

    @Override
    public void onFailure(Call<Analog> call, Throwable t) {

    }
}
