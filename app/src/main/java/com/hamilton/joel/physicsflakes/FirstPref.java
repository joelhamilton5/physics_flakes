package com.hamilton.joel.physicsflakes;

import android.content.Context;
import android.graphics.Typeface;
import android.preference.Preference;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by joel on 06/10/15.
 */
public class FirstPref extends Preference {

    private TextView title;

    public FirstPref(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onBindView(View v) {

        super.onBindView(v);
        title = (TextView) v.findViewById(android.R.id.title);

        if (title != null) {
            title.setGravity(Gravity.CENTER);
            title.setTextColor(getContext().getResources().getColor(R.color.white));
            title.setTypeface(null, Typeface.BOLD);

            v.setBackgroundResource(R.drawable.apply_button_background_selector);
        }
    }
}
