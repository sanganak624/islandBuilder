package com.example.islandbuilder;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    MapData mapData = MapData.get();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView rv = (RecyclerView) findViewById(R.id.recView);
        rv.setLayoutManager(new GridLayoutManager(this,MapData.HEIGHT,GridLayoutManager.HORIZONTAL,false));
        MapAdapter mapAdapter = new MapAdapter(mapData);
        rv.setAdapter(mapAdapter);
    }
}