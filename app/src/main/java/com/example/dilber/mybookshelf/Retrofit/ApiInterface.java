package com.example.dilber.mybookshelf.Retrofit;


import com.example.dilber.mybookshelf.Model.Response;
import com.example.dilber.mybookshelf.Model.bookInfo;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("/subjects/biography.json?limit=50")
    Call<Response> callResponse();

    @GET("/api/get")
    Call<bookInfo> callbookdetails(@Query("key") String key);

}
