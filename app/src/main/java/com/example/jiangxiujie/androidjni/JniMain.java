package com.example.jiangxiujie.androidjni;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class JniMain extends AppCompatActivity {
    private static final String TAG = "JniMain";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jni_main);
/*        Log.e(TAG, "onCreate: " + helloJni() );

        Integer addResult = new Integer(addCalc(12, 13));
        Log.e(TAG, "onCreate: " + addResult);*/
/*        helloJni();
        addCalc(1, 2);*/
    }

    public static native String helloJni();
    public static native int addCalc(int a, int b);
    static {
        System.loadLibrary("hello_jni"); // 注意没有前缀lib和后缀.so
    }
}
