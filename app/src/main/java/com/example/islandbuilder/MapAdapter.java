package com.example.islandbuilder;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.islandbuilder.MapData;


public class MapAdapter extends RecyclerView.Adapter<MapDataHolder> {

    MapData gamedata;

    public MapAdapter(MapData data)
    {
        gamedata = data;
    }
    @NonNull
    @Override
    public MapDataHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        MapDataHolder mapDataHolder = new MapDataHolder(layoutInflater,parent);

        return mapDataHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MapDataHolder holder, int position) {

        int row = position % MapData.HEIGHT;
        int col = position / MapData.HEIGHT;

        holder.bind(gamedata.get(row,col));
    }

    @Override
    public int getItemCount() {
        return MapData.WIDTH*MapData.HEIGHT;
    }
}
