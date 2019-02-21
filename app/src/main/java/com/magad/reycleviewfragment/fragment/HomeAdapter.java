package com.magad.reycleviewfragment.fragment;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.magad.reycleviewfragment.DetailActivity;
import com.magad.reycleviewfragment.MainActivity;
import com.magad.reycleviewfragment.R;

class HomeAdapter extends RecyclerView.Adapter<HomsAdapter> {

    Context context;
    String[] namacateg={"BMW","VW (VolksWagen)","bugatti","lamborghini","mazda","corvette","ferarri"};
    int[] namagam={
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background};

// method khusus yang sama nama nya kayak class yang kita buat
    public HomeAdapter(Context context) {
       this.context = context;
    }

    @NonNull
    @Override
    public HomsAdapter onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View v = LayoutInflater.from(context).inflate(R.layout.isireyclerview,null);
        return new HomsAdapter(v, context);
    }

    @Override
    public void onBindViewHolder(@NonNull HomsAdapter homsAdapter, final int i) {
    homsAdapter.iv.setImageResource(namagam[i]);
    homsAdapter.tv.setText(namacateg[i]);
    homsAdapter.ln.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            context.startActivity(new Intent(context,DetailActivity.class));
            //inisialisasi

//            Intent implicit = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.codepolitan.com"));
//            context.startActivity(implicit);
        }
    });
    }

    @Override
    public int getItemCount() {
        return namacateg.length;
    }
}
