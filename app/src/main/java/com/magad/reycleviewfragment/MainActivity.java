package com.magad.reycleviewfragment;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.magad.reycleviewfragment.fragment.FirstFragment;
import com.magad.reycleviewfragment.fragment.SecondFragment;

public class MainActivity extends AppCompatActivity {

    FragmentManager fm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fm = getSupportFragmentManager();
        fm.beginTransaction().add(R.id.jjjj,new FirstFragment()).addToBackStack("").commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.meni, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


        switch (item.getItemId()){
            case R.id.move1:
                fm.beginTransaction().add(R.id.jjjj,new FirstFragment()).addToBackStack("").commit();
                break;
            case R.id.move2:
                fm.beginTransaction().add(R.id.jjjj,new SecondFragment()).addToBackStack("").hide(new FirstFragment()).commit();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
