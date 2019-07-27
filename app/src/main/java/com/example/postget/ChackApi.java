package com.example.postget;

import com.example.postget.pojo.Analog;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ChackApi {
    @GET("jokes/random")
    Call<Analog> getRandom();

}
