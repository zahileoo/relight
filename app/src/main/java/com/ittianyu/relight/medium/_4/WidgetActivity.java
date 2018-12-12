package com.ittianyu.relight.medium._4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.ittianyu.relight.utils.WidgetUtils;

public class WidgetActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View root = WidgetUtils.render(this, UserLceeWidget.class);
        setContentView(root);
    }
}
