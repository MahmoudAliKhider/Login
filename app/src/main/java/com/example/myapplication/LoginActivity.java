package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    public static final String NAME_KEY ="NAME";
    public  static  final String PHONE_KEY="PHONE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
      final EditText namaEditText = findViewById(R.id.name_edit_text);
      final EditText phoneEditText =findViewById(R.id.phone_et);
        Button loginButton =findViewById(R.id.btn_login);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name=namaEditText.getText().toString();
                String phone=phoneEditText.getText().toString();

                if (name.equals("")||(phone.equals(""))){
                    Toast.makeText( LoginActivity.this,"name or phone is not empty",Toast.LENGTH_LONG).show();

                }else{
                Intent intent =new Intent(LoginActivity.this,DetalisActivity.class);
                intent.putExtra(NAME_KEY,name);
                intent.putExtra(PHONE_KEY,phone);

                startActivity(intent);
            }
            }
        });
    }


}
