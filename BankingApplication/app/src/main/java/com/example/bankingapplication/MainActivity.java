package com.example.bankingapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnViewUsers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnViewUsers = findViewById(R.id.btnViewUsers);
        btnViewUsers.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, UserList.class)));

    }
}