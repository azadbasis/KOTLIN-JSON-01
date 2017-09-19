package com.json01.spinner.kotlin.azhar.androidnativejsonep01spinnerdownloadparseandshow.Service;

import com.json01.spinner.kotlin.azhar.androidnativejsonep01spinnerdownloadparseandshow.Model.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Azhar on 9/18/2017.
 */

public interface APIService {

    @GET("json_bangla")
    Call<List<User>> getUserData();

}
