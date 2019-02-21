package com.magad.reycleviewfragment.fragment;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.magad.reycleviewfragment.R;

import java.util.zip.Inflater;

class Categoryadapter extends RecyclerView.Adapter<Catagor> {

    Context context;
    String[] namacateg={"enathlah","dimana"};
    int[] namagam={R.drawable.ic_launcher_background,R.drawable.ic_launcher_background};


    public Categoryadapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public Catagor onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(context).inflate(R.layout.isireyclerview,null);
        return new Catagor(v ,context);
    }

    @Override
    public void onBindViewHolder(@NonNull Catagor catagor, int i) {
    catagor.tv.setText(namacateg[i]);
    catagor.iv.setImageResource(namagam[i]);
    }

    @Override
    public int getItemCount() {
        return namacateg.length;
    }
}
