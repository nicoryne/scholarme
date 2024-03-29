package com.example.solutionsproject.activities;

import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.solutionsproject.R;

public class LoginSuccessActivity extends AppCompatActivity {
    private Button doneAuth;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog_login_success);


        doneAuth = findViewById(R.id.btnDoneAuthentication);
        doneAuth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginSuccessActivity.this, HomeActivity.class));
            }
        });
    }
}
