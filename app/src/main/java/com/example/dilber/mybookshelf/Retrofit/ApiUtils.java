package com.example.dilber.mybookshelf.Retrofit;

public class ApiUtils {

    static final String BASE_URL = "https://openlibrary.org/";

    public static ApiInterface getService(){

        return RetrofitClient.getClient(BASE_URL).create(ApiInterface.class);

    }
}
