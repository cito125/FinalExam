package com.example.andresarango.finalexam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.andresarango.finalexam.recyclerview.SettingsAdapter;

public class SettingsActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        initializeRecyclerView();
    }

    private void initializeRecyclerView() {
        mRecyclerView = (RecyclerView) findViewById(R.id.settings_recyclerview);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(SettingsActivity.this));
        mRecyclerView.setAdapter(new SettingsAdapter());
    }
}
