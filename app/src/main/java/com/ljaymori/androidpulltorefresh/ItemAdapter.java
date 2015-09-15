package com.ljaymori.androidpulltorefresh;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class ItemAdapter extends RecyclerView.Adapter<ItemView> {

    private ArrayList<String> items = new ArrayList<String>();
    private Context mContext;

    public ItemAdapter(Context mContext) {
        this.mContext = mContext;
    }

    public void addAll(ArrayList<String> list) {
        items.addAll(list);
        notifyDataSetChanged();
    }

    @Override
    public ItemView onCreateViewHolder(ViewGroup parent, int i) {
        View v = LayoutInflater.from(mContext).inflate(R.layout.item, parent, false);

        return new ItemView(v);
    }

    @Override
    public void onBindViewHolder(ItemView holder, int position) {
        holder.setItemView(items.get(position));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
