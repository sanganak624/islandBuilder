package com.example.islandbuilder;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

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

        RecyclerView rv = (RecyclerView) findViewById(R.id.recView);

        rv.setLayoutManager(new GridLayoutManager(this,MapData.HEIGHT,GridLayoutManager.HORIZONTAL,false));
        MapAdapter mapAdapter = new MapAdapter(mapData);
        rv.setAdapter(mapAdapter);
    }
}