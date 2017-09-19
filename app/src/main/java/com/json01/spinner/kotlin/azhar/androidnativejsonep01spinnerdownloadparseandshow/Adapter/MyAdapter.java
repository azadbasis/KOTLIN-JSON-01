package com.json01.spinner.kotlin.azhar.androidnativejsonep01spinnerdownloadparseandshow.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.json01.spinner.kotlin.azhar.androidnativejsonep01spinnerdownloadparseandshow.R;
import com.json01.spinner.kotlin.azhar.androidnativejsonep01spinnerdownloadparseandshow.ViewHolder.Myholder;
import com.json01.spinner.kotlin.azhar.androidnativejsonep01spinnerdownloadparseandshow.Model.User;

import java.util.List;

/**
 * Created by Azhar on 9/18/2017.
 */

public class MyAdapter extends RecyclerView.Adapter<Myholder> {

    private List<User> userLists;

    public MyAdapter(List<User> userLists) {
        this.userLists = userLists;
    }

    @Override
    public Myholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_raw,null);
        Myholder myholder=new Myholder(view);
        return myholder;
    }

    @Override
    public void onBindViewHolder(Myholder holder, int position) {

        holder.tvName.setText(userLists.get(position).getName());
        holder.tvHobby.setText(userLists.get(position).getHobby());
    }

    @Override
    public int getItemCount() {
        return userLists.size();
    }
}
