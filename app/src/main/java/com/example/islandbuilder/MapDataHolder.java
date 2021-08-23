package com.example.islandbuilder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MapDataHolder extends RecyclerView.ViewHolder {
    ImageView northwest;
    ImageView northeast;
    ImageView southwest;
    ImageView southeast;

    public MapDataHolder(@NonNull View itemView) {
        super(itemView);

        northwest = itemView.findViewById(R.id.northwest);
        northeast = itemView.findViewById(R.id.northeast);
        southwest = itemView.findViewById(R.id.southwest);
        southeast = itemView.findViewById(R.id.southeast);
    }

    public MapDataHolder(LayoutInflater li, ViewGroup parent) {
        super( li.inflate(R.layout.grid4x4,
                parent, false) );

        int size = parent.getMeasuredHeight() / MapData.HEIGHT + 1;
        ViewGroup.LayoutParams lp =  itemView.getLayoutParams();
        lp.width = size;
        lp.height = size;

        northwest = itemView.findViewById(R.id.northwest);
        northeast = itemView.findViewById(R.id.northeast);
        southwest = itemView.findViewById(R.id.southwest);
        southeast = itemView.findViewById(R.id.southeast);
    }


}
