package com.project.ptpm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    TextInputEditText tx_email_content, tx_password_content;
    Button btn_login, btn_daftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        tx_email_content = (TextInputEditText) findViewById(R.id.tx_email_content);
        tx_password_content = (TextInputEditText) findViewById(R.id.tx_password_content);
        btn_login = (Button) findViewById(R.id.btn_login);
        btn_daftar = (Button) findViewById(R.id.btn_daftar);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ContentActivity.class);
                startActivity(i);
            }
        });
    }
}