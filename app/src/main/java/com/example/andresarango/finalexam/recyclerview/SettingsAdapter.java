package com.example.andresarango.finalexam.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by andresarango on 2/12/17.
 */
public class SettingsAdapter extends RecyclerView.Adapter<SettingsViewHolder> {
    @Override
    public SettingsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new SettingsViewHolder(new TextView(parent.getContext()));
    }

    @Override
    public void onBindViewHolder(SettingsViewHolder holder, int position) {
        holder.bind(position);
    }

    @Override
    public int getItemCount() {
        return Integer.MAX_VALUE;
    }
}
