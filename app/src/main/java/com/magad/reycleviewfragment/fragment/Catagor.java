package com.magad.reycleviewfragment.fragment;

import android.arch.core.executor.TaskExecutor;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.magad.reycleviewfragment.R;

class Catagor extends RecyclerView.ViewHolder {

    TextView tv;
    ImageView iv;

    public Catagor(@NonNull View itemView, Context context) {
        super(itemView);
        tv = itemView.findViewById(R.id.tv_categ);
        iv = itemView.findViewById(R.id.iv_gg);
    }
}
