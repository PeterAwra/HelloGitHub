package com.study.awra.hellogithub;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String KEY_ORIENTATION = "orientation";
    private static final String KEY_COUNT_ROTATION = "COUNT_ROTATION";
    private static final String KEY_TEXT = "TEXT";
    private static final String TAG="MainActivity.Log";
    private String mText;
    private int mCountRotation=0;
    private int orientation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        test
        mText=getResources().getString(R.string.count_rotation);
        TextView textView = findViewById(R.id.tv);
        orientation=getWindowManager().getDefaultDisplay().getRotation();
        if(savedInstanceState!=null){
            mText=savedInstanceState.getString(KEY_TEXT,mText);
            mCountRotation=savedInstanceState.getInt(KEY_COUNT_ROTATION,0);
            if(savedInstanceState.getInt(KEY_ORIENTATION,0)!=orientation) {
                mCountRotation++;
            }
        }
        if(mCountRotation!=0) mText+=",";
        mText+=" "+String.valueOf(mCountRotation);
        textView.setText(mText);

        logger("onCreate()");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(KEY_COUNT_ROTATION,mCountRotation);
        outState.putInt(KEY_ORIENTATION,orientation);
        outState.putString(KEY_TEXT,mText);logger("onSaveInstanceState()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        logger("onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        logger("onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        logger("onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        logger("onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        logger("onDestroy()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        logger("onRestart()");
    }

    private void logger(String s) {
        Log.d(TAG,s);

    }

}
