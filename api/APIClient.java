package com.example.myfeeds.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class APIClient {
    public static String BASE_URL = "https://jsonplaceholder.typicode.com";

    public static Retrofit retrofit = null;

    public  static Retrofit getRClient(){
       if(retrofit==null){
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
       }


        return retrofit;
    }

}
