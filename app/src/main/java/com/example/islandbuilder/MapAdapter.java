package com.example.islandbuilder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


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
        View view = layoutInflater.inflate(R.layout.grid4x4,parent,false);
        MapDataHolder mapDataHolder = new MapDataHolder(view);

        RecyclerView itemView = parent.findViewById(R.id.recView);
        int size = parent.getMeasuredHeight() / MapData.HEIGHT + 1;
        ViewGroup.LayoutParams lp =  itemView.getLayoutParams();
        lp.width = size;
        lp.height = size;


        return mapDataHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MapDataHolder holder, int position) {
        for(int i=0; i<MapData.HEIGHT; i++)
        {
            MapElement element = gamedata.get(i,position);
            holder.northeast.setImageResource(element.getNorthEast());
            holder.northwest.setImageResource(element.getNorthWest());
            holder.southwest.setImageResource(element.getSouthWest());
            holder.southeast.setImageResource(element.getSouthEast());
        }
    }

    @Override
    public int getItemCount() {
        return MapData.WIDTH ;
    }
}
