package com.example.a1homework6;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a1homework6.databinding.ItemSongsBinding;

import java.util.ArrayList;

public class SongsAdapter extends RecyclerView.Adapter<SongsAdapter.ViewHolder> {
    private ArrayList<Model> list;
    private OnItemClick onItemClick;

    public SongsAdapter(ArrayList<Model> list, OnItemClick onItemClick) {
        this.list = list;
        this.onItemClick=onItemClick;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(ItemSongsBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.onBind(list.get(position));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ItemSongsBinding binding;
        public ViewHolder(@NonNull ItemSongsBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;
        }

        public void onBind(Model model) {
            binding.tvNumber.setText(model.getNumber());
            binding.tvSongName.setText(model.getSongs());
            binding.tvAuthor.setText(model.getAuthor());
            binding.tvTime.setText(model.getTime());
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    onItemClick.onlick(list.get(getLayoutPosition()));
                }
            });
        }
    }


}
