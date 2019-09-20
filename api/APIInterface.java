package com.example.myfeeds.api;

import com.example.myfeeds.model.Posts;
import com.example.myfeeds.model.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public class APIInterface {
    @GET("Post/")
    public Call<List<Posts>> getAllPosts() {
        return null;
    }

    @GET("users/{id}")
    public Call<User> getUser(@Path("id") int id) {
        return null;
    }

}
