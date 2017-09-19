package com.json01.spinner.kotlin.azhar.androidnativejsonep01spinnerdownloadparseandshow.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.json01.spinner.kotlin.azhar.androidnativejsonep01spinnerdownloadparseandshow.R;

/**
 * Created by Azhar on 9/18/2017.
 */

public class Myholder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView tvName,tvHobby;
    public Myholder(View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);
        tvName=(TextView) itemView.findViewById(R.id.tvName);
        tvHobby=(TextView) itemView.findViewById(R.id.tvHobby);

    }

    @Override
    public void onClick(View view) {

    }
}
