package com.example.a24_mytoast;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MyToast extends Toast {
    /**
     * Construct an empty Toast object.  You must call {@link #setView} before you
     * can call {@link #show}.
     *
     * @param context The context to use.  Usually your {@link Application}
     *                or {@link Activity} object.
     */
    public MyToast(Context context) {
        super(context);
    }

    //메소드는 static 으로
    public static Toast makeText (Context context, String message, int duration){
        Toast toast = new Toast(context);
        //커스텀 뷰
        View customView = LayoutInflater.from(context).inflate(R.layout.toast_layout, null);
        TextView textView = customView.findViewById(R.id.toast_text);
        textView.setText(message);

        //셋뷰
        toast.setView(customView);
        toast.setDuration(duration);

        //중간을 기준으로 얼마나 이동할 것이냐
        toast.setGravity(Gravity.CENTER, 0, -300);
        return toast;
    }
}
