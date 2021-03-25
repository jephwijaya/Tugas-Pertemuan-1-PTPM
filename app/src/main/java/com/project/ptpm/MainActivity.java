package com.project.ptpm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
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

//        tx_email_content.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence s, int start, int before, int count) {
//
//            }
//
//            public void afterTextChanged(Editable edt) {
//                if (tx_email_content.getText().length() > 0) {
//                    tx_email_content.setError(null);
//                }
//            }
//        });
//
//        tx_password_content.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence s, int start, int before, int count) {
//
//            }
//
//            public void afterTextChanged(Editable edt) {
//                if (tx_password_content.getText().length() > 0) {
//                    tx_password_content.setError(null);
//                }
//            }
//        });
    }
}