package com.example.andresarango.finalexam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class ProfileActivity extends AppCompatActivity {

    private static final String HEART_BUTTON_TOAST = "Selected Heart Activity";
    private static final String MESSAGE_BUTTON_TOAST = "Selected Message Activity";
    private ImageButton mHeartButton;
    private ImageButton mMessageButton;
    private ImageButton mSettingsButton;
    private ImageButton mLogoutButton;
    private View mHeartItemView;
    private View mMessageItemView;
    private View mSettingsItemView;
    private View mLogoutItemView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_navigation_drawer);
        initializeViews();
        setClickListeners();
    }

    private void initializeViews() {
        mHeartButton = (ImageButton) findViewById(R.id.profile_button_heart);
        mMessageButton = (ImageButton) findViewById(R.id.profile_button_message);
        mSettingsButton = (ImageButton) findViewById(R.id.profile_button_settings);
        mLogoutButton = (ImageButton) findViewById(R.id.profile_button_logout);

        mHeartItemView = findViewById(R.id.profile_drawer_heart_layout);
        mMessageItemView = findViewById(R.id.profile_drawer_message_layout);
        mSettingsItemView = findViewById(R.id.profile_drawer_settings_layout);
        mLogoutItemView = findViewById(R.id.profile_drawer_logout_layout);



    }

    private void setClickListeners() {
        mHeartButton.setOnClickListener(onClick());
        mMessageButton.setOnClickListener(onClick());
        mSettingsButton.setOnClickListener(onClick());
        mLogoutButton.setOnClickListener(onClick());

        mHeartItemView.setOnClickListener(onClick());
        mMessageItemView.setOnClickListener(onClick());
        mSettingsItemView.setOnClickListener(onClick());
        mLogoutItemView.setOnClickListener(onClick());
    }

    private View.OnClickListener onClick() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.profile_drawer_heart_layout:
                    case R.id.profile_button_heart:
                        Toast.makeText(ProfileActivity.this, HEART_BUTTON_TOAST, Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.profile_drawer_message_layout:
                    case R.id.profile_button_message:
                        Toast.makeText(ProfileActivity.this, MESSAGE_BUTTON_TOAST, Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.profile_drawer_settings_layout:
                    case R.id.profile_button_settings:
                        Intent settingsActivityIntent = new Intent(ProfileActivity.this,SettingsActivity.class);
                        startActivity(settingsActivityIntent);
                        break;
                    case R.id.profile_drawer_logout_layout:
                    case R.id.profile_button_logout:
                        Intent intent = new Intent(Intent.ACTION_MAIN);
                        intent.addCategory(Intent.CATEGORY_HOME);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent);
                }
            }
        };
    }
}
