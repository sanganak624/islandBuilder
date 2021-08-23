package com.example.islandbuilder;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Fragment;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;

public class MainActivity extends AppCompatActivity {
    MapData mapData = MapData.get();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //mapData.regenerate();

        FragmentManager fm = getSupportFragmentManager();
        MapFragment mapFrag = (MapFragment) fm.findFragmentById(R.id.mapFragment);

        if(mapFrag==null)
        {
            mapFrag = new MapFragment();
            fm.beginTransaction().add(R.id.mapFragment,mapFrag).commit();
        }
    }
}