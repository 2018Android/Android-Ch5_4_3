package com.example.admin.ch5_4_3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void button1_click(View view){
        Toast.makeText(this, "Hello button1", Toast.LENGTH_LONG).show();
    }

}