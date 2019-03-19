package com.study.awra.hellogithub;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int mCountRotation=0;
    private String mText;
    private static final String KEY_COUNT_ROTATION = "COUNT_ROTATION";
    private static final String KEY_TETX = "TETX";
    private static final String TAG="MainActivity.Log";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mText=getResources().getString(R.string.count_rotation);
        TextView view=findViewById(R.id.tv);
        if(savedInstanceState!=null){
            mText=savedInstanceState.getString(KEY_TETX,mText);
            mCountRotation=savedInstanceState.getInt(KEY_COUNT_ROTATION,0);
            if(mCountRotation!=0)
                mText+=", ";
        }
        mText+=" "+mCountRotation++;
        view.setText(mText);
        logger("onCreate()");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(KEY_COUNT_ROTATION,mCountRotation);
        outState.putString(KEY_TETX,mText);
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
