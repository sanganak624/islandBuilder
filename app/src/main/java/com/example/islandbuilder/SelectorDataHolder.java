package com.example.islandbuilder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SelectorDataHolder extends RecyclerView.ViewHolder{

    ImageView structure;
    private int pos;

    public SelectorDataHolder(LayoutInflater li, ViewGroup parent) {
        super(li.inflate(R.layout.selector, parent, false));

        //int size = (int) (parent.getMeasuredHeight()*0.2);
        ViewGroup.LayoutParams lp =  itemView.getLayoutParams();
        lp.width = 150;
        lp.height = 150;

        structure = itemView.findViewById(R.id.structure);
    }

    public void bind(Structure data)
    {
        structure.setImageResource(data.getDrawableId());
    }

    public int getSelected(SelectorDataHolder holder)
    {
        structure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pos = holder.getAdapterPosition();
            }
        });
        return pos;
    }
}
