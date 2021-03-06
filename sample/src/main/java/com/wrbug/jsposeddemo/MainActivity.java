package com.wrbug.jsposeddemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.widget.CheckBox;
import android.widget.TextView;

import com.wrbug.jsposed.BuildConfig;
import com.wrbug.jsposed.R;

public class MainActivity extends AppCompatActivity {

    private TextView tv;
    private CheckBox mCheckBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.tv);
        tv.setText(BuildConfig.MODULES_NAME);
        mCheckBox = findViewById(R.id.checkbox);

    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent event) {
        return super.dispatchKeyEvent(event);
    }
}
