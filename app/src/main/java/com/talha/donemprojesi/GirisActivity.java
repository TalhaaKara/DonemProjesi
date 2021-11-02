package com.talha.donemprojesi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class GirisActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giris);

        RadioGroup radioGroup = findViewById(R.id.radioGroup);
        TextView textview =(TextView)findViewById(R.id.textView);
        RadioButton _3x4,_4x4;
        _3x4 = (RadioButton)findViewById(R.id._3x4);
        _4x4 = (RadioButton)findViewById(R.id._4x4);

        String data1="hayvan";
        String data2="brawler";
        String data3="karisik";

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(_3x4.isChecked()){
                    Intent intent = new Intent(GirisActivity.this,MainActivity.class);
                    intent.putExtra("Key",data1);
                    startActivity(intent);
                }else if(_4x4.isChecked()){
                    Intent intent = new Intent(GirisActivity.this,MainActivity4x4.class);
                    intent.putExtra("Key",data1);
                    startActivity(intent);
                }

            }
        });

        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(_3x4.isChecked()){
                    Intent intent = new Intent(GirisActivity.this,MainActivity.class);
                    intent.putExtra("Key",data2);
                    startActivity(intent);
                }else if(_4x4.isChecked()){
                    Intent intent = new Intent(GirisActivity.this,MainActivity4x4.class);
                    intent.putExtra("Key",data2);
                    startActivity(intent);
                }
            }
        });

        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(_3x4.isChecked()){
                    Intent intent = new Intent(GirisActivity.this,MainActivity.class);
                    intent.putExtra("Key",data3);
                    startActivity(intent);
                }else if(_4x4.isChecked()){
                    Intent intent = new Intent(GirisActivity.this,MainActivity4x4.class);
                    intent.putExtra("Key",data3);
                    startActivity(intent);
                }
            }
        });
    }
}
