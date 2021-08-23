package com.example.islandbuilder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SelectorDataHolder extends RecyclerView.ViewHolder{

    ImageView structure;

    public SelectorDataHolder(LayoutInflater li, ViewGroup parent) {
        super(li.inflate(R.layout.selector, parent, false));

        int size = parent.getMeasuredHeight() +250;
        ViewGroup.LayoutParams lp =  itemView.getLayoutParams();
        lp.width = 100;
        lp.height = 100;

        structure = itemView.findViewById(R.id.structure);
    }

    public void bind(Structure data)
    {
        structure.setImageResource(data.getDrawableId());
    }
}
