package com.nareshit.checkbox_application;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    //Declaration
    CheckBox cbAndroid,cbIos,cbWindow;
    TextView tvSubmit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cbAndroid= (CheckBox) findViewById(R.id.cb_Android);
        cbIos= (CheckBox) findViewById(R.id.cbIos);
        cbWindow= (CheckBox) findViewById(R.id.cbWindows);
        tvSubmit= (TextView) findViewById(R.id.tvSubmit);

        tvSubmit.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        String android=cbAndroid.getText().toString();
        String ios=cbIos.getText().toString();
        String window=cbWindow.getText().toString();
        Intent i=new Intent(MainActivity.this,NextActivity.class);

        i.putExtra("android",android);
        i.putExtra("ios",ios);
        i.putExtra("window",window);

        startActivity(i);
    }
}
