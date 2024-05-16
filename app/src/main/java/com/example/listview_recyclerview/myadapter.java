package com.example.listview_recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class myadapter extends RecyclerView.Adapter<myViewholder> {
    Context context;
    List<item> items;

    public myadapter(Context context, List<item> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public myViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recyclerview_layout, parent, false);
        return new myViewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewholder holder, int position) {
        item currentItem = items.get(position);

        holder.textview1.setText(currentItem.getName());
        holder.textview2.setText(currentItem.getEmail());
        holder.imageView.setImageResource(currentItem.getImage());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
