package com.example.islandbuilder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SelectorAdapter extends RecyclerView.Adapter<SelectorDataHolder> {

    RecyclerView rv;

    public SelectorAdapter(RecyclerView rv)
    {
        this.rv = rv;
    }

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
        holder.bind(StructureData.get().get(position),position,rv);


    }

    @Override
    public int getItemCount() {
        return StructureData.get().size();
    }
}
