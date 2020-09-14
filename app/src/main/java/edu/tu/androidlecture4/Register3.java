package edu.tu.androidlecture4;

import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.widget.TextView;

public class Register3 extends WearableActivity {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register3);

        mTextView = (TextView) findViewById(R.id.text);

        // Enables Always-on
        setAmbientEnabled();
    }
}