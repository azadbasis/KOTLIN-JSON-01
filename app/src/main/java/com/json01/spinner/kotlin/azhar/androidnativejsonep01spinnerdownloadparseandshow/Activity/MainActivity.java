package com.json01.spinner.kotlin.azhar.androidnativejsonep01spinnerdownloadparseandshow.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;


import com.json01.spinner.kotlin.azhar.androidnativejsonep01spinnerdownloadparseandshow.Adapter.MyAdapter;
import com.json01.spinner.kotlin.azhar.androidnativejsonep01spinnerdownloadparseandshow.Model.User;
import com.json01.spinner.kotlin.azhar.androidnativejsonep01spinnerdownloadparseandshow.Network.ApiClient;
import com.json01.spinner.kotlin.azhar.androidnativejsonep01spinnerdownloadparseandshow.R;
import com.json01.spinner.kotlin.azhar.androidnativejsonep01spinnerdownloadparseandshow.Service.APIService;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getUserList();
    }

    private void getUserList() {
try {



    APIService apiService= ApiClient.getRetrofit().create(APIService.class);
    Call<List<User>> call=apiService.getUserData();
    call.enqueue(new Callback<List<User>>() {
        @Override
        public void onResponse(Call<List<User>> call, Response<List<User>> response) {


            Log.d("response", String.valueOf(response));
            List<User> userList=response.body();
            LinearLayoutManager linearLayoutManager= new LinearLayoutManager(MainActivity.this);
            RecyclerView recyclerView=(RecyclerView)findViewById(R.id.retrofitRecycler);
            recyclerView.setLayoutManager(linearLayoutManager);
            MyAdapter myAdapter=new MyAdapter(userList);
            recyclerView.setAdapter(myAdapter);



        }

        @Override
        public void onFailure(Call<List<User>> call, Throwable t) {
            Log.d("Exception", String.valueOf(t));
        }
    });

}catch (Exception e){

}
    }
}
