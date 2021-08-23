package com.example.islandbuilder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SelectorAdapter extends RecyclerView.Adapter<SelectorDataHolder> {

    @NonNull
    @Override
    public SelectorDataHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        SelectorDataHolder selectorDataHolder = new SelectorDataHolder(layoutInflater,parent);

        return selectorDataHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull SelectorDataHolder holder, int position) {
        holder.bind(StructureData.get().get(position));

    }

    @Override
    public int getItemCount() {
        return StructureData.get().size();
    }
}
