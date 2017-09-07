package com.mh.test.slidingconflict;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/**
 * Created by 17-06-027 on 2017/9/7.
 */

public class WaiLinearLayout extends LinearLayout{
    public WaiLinearLayout(Context context) {
        super(context);
    }

    public WaiLinearLayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        return false;
    }
}
