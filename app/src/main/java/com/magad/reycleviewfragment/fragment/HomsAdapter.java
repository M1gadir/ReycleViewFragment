package com.magad.reycleviewfragment.fragment;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.magad.reycleviewfragment.DetailActivity;
import com.magad.reycleviewfragment.R;

class HomsAdapter extends RecyclerView.ViewHolder {
    LinearLayout ln;
    ImageView iv;
    TextView tv;

    public HomsAdapter(@NonNull final View itemView, final Context context) {
        super(itemView);
        iv = itemView.findViewById(R.id.iv_gg);
        tv = itemView.findViewById(R.id.tv_categ);
        ln = itemView.findViewById(R.id.LN_enaht);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(new Intent(context, DetailActivity.class));
            }
        });

    }
}
