package com.example.admin.ch5_4_3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void button1_click(View view){
        String button1Text = ((Button)view).getText().toString(); //找到button1的buttonText並轉換成文字
        Toast.makeText(this, button1Text, Toast.LENGTH_LONG).show(); //顯示button1的buttonText提示文字
        ((Button)view).setText("change button Text"); //將button1的buttonText文字替換掉


        Button button2 = (Button)findViewById(R.id.button2); //利用button的id找到button2
        button2.setText("i love sun"); //將button2的buttonText文字替換掉
    }

}