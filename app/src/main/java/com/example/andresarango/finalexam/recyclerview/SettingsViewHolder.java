package com.example.andresarango.finalexam.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by andresarango on 2/12/17.
 */
public class SettingsViewHolder extends RecyclerView.ViewHolder {
    public SettingsViewHolder(TextView itemView) {
        super(itemView);
    }


    public void bind(int position) {
        ((TextView) itemView).setText("Settings - " + Integer.toString(position));
    }
}
