package com.example.postget;

import android.app.Application;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class App extends Application {
    private Retrofit retrofit;
    private static ChackApi api;
    private String BASE_URL = "http://api.icndb.com/";
    @Override
    public void onCreate() {
        super.onCreate();
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL) //Базовая часть адреса
                .addConverterFactory(GsonConverterFactory.create()) //Конвертер, необходимый для преобразования JSON'а в объекты
                .build();
        api = retrofit.create(ChackApi.class); //Создаем объект, при помощи которого будем выполнять запросы
    }

    public static ChackApi getApi() {
        return api;
    }
    }




