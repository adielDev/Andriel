package com.andriel.numpicker;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.andriel.R;

public class NumPickerView extends FrameLayout {

    public NumPickerView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context,attrs);
    }

    public NumPickerView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context,attrs);
    }

    private void init(@NonNull Context context, @Nullable AttributeSet attrs) {

        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.NumPickerView);

        String str = a.getString(R.styleable.NumPickerView_message);
        //do something with str

        a.recycle();
        LayoutInflater.from(getContext()).inflate(R.layout.num_picker_view, this);
        TextView tv = findViewById(R.id.tv);
        tv.setText(str);
    }


    public static class UiData{

        public String message="message";

    }

}
