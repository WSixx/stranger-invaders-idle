package com.example.strangerinvaders.ui.customcomponents;

import android.content.Context;
import android.util.AttributeSet;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;

/**
 * created on 17/11/2022
 *
 * @author Lucas Goncalves
 */
public class MyTextViewWithSubText extends LinearLayoutCompat {

    public MyTextViewWithSubText(@NonNull Context context) {
        super(context);
    }

    public MyTextViewWithSubText(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyTextViewWithSubText(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
