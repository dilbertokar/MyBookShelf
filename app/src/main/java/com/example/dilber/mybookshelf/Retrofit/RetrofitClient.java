package com.example.dilber.mybookshelf.Retrofit;

import com.google.android.gms.common.api.Api;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

 public class RetrofitClient {

     static Retrofit retrofit;

     public static Retrofit getClient(String baseurl){
         if(retrofit== null){
             retrofit = new Retrofit.Builder()
                     .baseUrl(baseurl)
                     .addConverterFactory(GsonConverterFactory.create())
                     .client(new OkHttpClient())
                     .build();
             return retrofit;
         }
         return retrofit;


     }
 }