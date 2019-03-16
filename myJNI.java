package com.zhc.jni;

/**
 * Created by liujun on 2017/7/18.
 */

public class myJNI {


    static {
        System.loadLibrary("JniTest");
    }


    public static native String sayHello();


}
