package com.example.dilber.mybookshelf.Retrofit;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("/subjects/biography.json?limit=5")
    Call<Response> callResponse();

    @GET("/api/get")
    Call<bookInfo> callbookdetails(@Query("key") String key);

}
