package com.example.xy.plan;


import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;


public class TitleLayout1 extends LinearLayout {
    public TitleLayout1(Context context, AttributeSet attrs) {
        super(context, (AttributeSet) attrs);
        LayoutInflater.from(context).inflate(R.layout.title1, this);

    }
}