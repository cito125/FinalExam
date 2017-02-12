package com.example.andresarango.finalexam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {


    private static final String TOAST_MESSAGE_FOR_MISSING_USERNAME = "Enter a username";
    private static final String TOAST_MESSAGE_FOR_MISSING_PASSWORD = "Enter a password";
    private EditText mUsernameEditText;
    private EditText mPassswordEditText;
    private Button mSubmitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initializeViews();
    }

    private void initializeViews() {
        mUsernameEditText = (EditText) findViewById(R.id.login_edit_text_username);
        mPassswordEditText = (EditText) findViewById(R.id.login_edit_text_password);
        mSubmitButton = (Button) findViewById(R.id.login_button_submit);
        mSubmitButton.setOnClickListener(onClick());
    }

    private View.OnClickListener onClick() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = mUsernameEditText.getText().toString();
                String password = mPassswordEditText.getText().toString();

                if (username.isEmpty()) {
                    Toast.makeText(LoginActivity.this, TOAST_MESSAGE_FOR_MISSING_USERNAME, Toast.LENGTH_SHORT).show();
                }

                if (password.isEmpty()) {
                    Toast.makeText(LoginActivity.this, TOAST_MESSAGE_FOR_MISSING_PASSWORD, Toast.LENGTH_SHORT).show();
                }

                if(!(username.isEmpty() && password.isEmpty())){
                    Intent intent = new Intent(LoginActivity.this,ProfileActivity.class);
                    startActivity(intent);
                }

            }
        };
    }
}
