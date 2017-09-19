package com.json01.spinner.kotlin.azhar.androidnativejsonep01spinnerdownloadparseandshow.Network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Azhar on 9/18/2017.
 */

public class ApiClient {

    public static final String BASE_URL = "http://shaoniiuc.com/";
    private static Retrofit retrofit = null;


    public static Retrofit getRetrofit() {
        if (retrofit == null) {

            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

        }
        return retrofit;
    }


}
