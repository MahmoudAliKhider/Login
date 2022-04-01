package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("MainActivity", "onCreate: ");
    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.i("MainActivity" ,"onStart: ");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.i("ManActivity", "onResume: ");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.i("MainActivity", "onPause: ");

    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.i("MainActivity", "onStop: ");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i("MainActivity", "onDestroy: ");
    }
}