package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
    public static final String NAME_KEY ="NAME";
    public  static  final String PHONE_KEY="PHONE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        EditText namaEditText = findViewById(R.id.name_edit_text);
        EditText phoneEditText =findViewById(R.id.phone_et);
        Button loginButton =findViewById(R.id.btn_login);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              String name=namaEditText.getText().toString();
              String phone=phoneEditText.getText().toString();
                Intent intent =new Intent(MainActivity2.this,DetalisActivity.class);
                intent.putExtra(NAME_KEY,name);
                intent.putExtra(PHONE_KEY,phone);
                startActivity(intent);
            }
        });
        }


    }
