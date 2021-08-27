package com.example.islandbuilder;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SelectorDataHolder extends RecyclerView.ViewHolder{

    ImageView structure;
    StructureData structureData = StructureData.get();


    public SelectorDataHolder(LayoutInflater li, ViewGroup parent) {
        super(li.inflate(R.layout.selector, parent, false));


        ViewGroup.LayoutParams lp =  itemView.getLayoutParams();
        lp.width = 150;
        lp.height = 150;

        structure = itemView.findViewById(R.id.structure);
    }

    public void bind(Structure data,int pos,RecyclerView rv)
    {
        structure.setImageResource(data.getDrawableId());
        SelectorAdapter adapter = (SelectorAdapter) rv.getAdapter();
        if(StructureData.get().getSelected()!=data)
        {
            structure.setBackgroundColor(Color.TRANSPARENT);
        }
        else
        {
            structure.setBackgroundColor(Color.GREEN);
        }
        structure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(StructureData.get().getSelectedPos()!=-1)
                {
                    adapter.notifyItemChanged(StructureData.get().getSelectedPos());
                }

                if(StructureData.get().getSelected()!=data)
                {

                    structureData.setIsSelected(data);
                    structureData.setSelectedPos(pos);
                    structure.setBackgroundColor(Color.GREEN);
                }
                else
                {
                    structureData.setIsSelected(null);
                    structureData.setSelectedPos(-1);
                    structure.setBackgroundColor(Color.TRANSPARENT);
                }
            }
        });

    }
}
