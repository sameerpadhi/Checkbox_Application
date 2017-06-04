package com.nareshit.checkbox_application;

import android.app.Activity;
import android.os.Bundle;
import android.widget.CheckBox;

/**
 * Created by hp on 9/21/2016.
 */
public class NextActivity extends Activity{
    //Declaration
    CheckBox cbAndroid,cbIos,cbWindow;

    @Override
    protected void onCreate(Bundle b) {
        super.onCreate(b);
        setContentView(R.layout.activity_main);

        cbAndroid = (CheckBox) findViewById(R.id.cb_Android);
        cbIos = (CheckBox) findViewById(R.id.cbIos);
        cbWindow = (CheckBox) findViewById(R.id.cbWindows);

    b=getIntent().getExtras();
        String android=b.getString("android");
        String ios=b.getString("ios");
        String window=b.getString("window");

        cbAndroid.setText(android);
        cbAndroid.setText(ios);
        cbAndroid.setText(window);
    }
}
