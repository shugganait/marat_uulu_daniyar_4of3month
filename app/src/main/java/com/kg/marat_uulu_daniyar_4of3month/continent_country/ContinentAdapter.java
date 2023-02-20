package com.kg.marat_uulu_daniyar_4of3month.continent_country;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.kg.marat_uulu_daniyar_4of3month.databinding.ItemContinentBinding;

import java.util.ArrayList;

public class ContinentAdapter extends RecyclerView.Adapter<ContinentViewHolder> {
    private ArrayList<Continent> continentList;
    private OnClick onItemClick;

    public ContinentAdapter(ArrayList<Continent> continentList, OnClick onItemClick) {
        this.continentList = continentList;
        this.onItemClick = onItemClick;
    }

    @NonNull
    @Override
    public ContinentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ContinentViewHolder(ItemContinentBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ContinentViewHolder holder, int position) {
        holder.bind(continentList.get(position));
        holder.itemView.setOnClickListener(view -> {
            onItemClick.onClick(position);
        });
    }

    @Override
    public int getItemCount() {
        return continentList.size();
    }
}
class ContinentViewHolder extends RecyclerView.ViewHolder {
    private ItemContinentBinding binding;

    public ContinentViewHolder(ItemContinentBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    void bind(Continent continent){
        binding.tvName.setText(continent.getName());
        Glide.with(binding.imgMap).load(continent.getMap()).into(binding.imgMap);
    }
}
