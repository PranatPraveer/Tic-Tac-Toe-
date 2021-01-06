package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Splashactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashactivity);
        getSupportActionBar().hide();
        Thread thread=new Thread(){
            public void run(){
                try{
                    sleep(2000);
                }
                catch (Exception e){
                    e.printStackTrace();
                }
                finally{
                    Intent intent=new Intent(Splashactivity.this,getname.class);
                    startActivity(intent);
                    finish();
                }
            }
        };thread.start();
    }
}