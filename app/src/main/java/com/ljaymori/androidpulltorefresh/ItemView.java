package com.ljaymori.androidpulltorefresh;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class ItemView extends RecyclerView.ViewHolder {

    private TextView tvItem;

    public ItemView(View itemView) {
        super(itemView);

        tvItem = (TextView) itemView.findViewById(R.id.text_item);
    }

    public void setItemView(String string) {
        tvItem.setText(string);
    }
}
