package com.wrbug.jsposeddemo;

import android.app.Activity;
import android.content.Intent;
import android.view.View;

import com.wrbug.jsposed.jclass.build.sample.JsActivity_;
import com.wrbug.jsposedannotation.JavaClass;

@JavaClass(value = Activity.class)
public class JsActivity extends JsActivity_ {

    public View findViewById(String idName) {
        return findViewById(getResources().getIdentifier(idName, "id", getPackageName()));
    }


}
