package com.example.islandbuilder;

import android.view.View;
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
}
