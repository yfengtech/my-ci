package org.example;

public class JNIDemo {

    static {
        System.load("/Users/anthony/IdeaProjects/JavaTest/libs/librust_jni.dylib");
    }

    // 静态方法
    public static native String staticSayHello(String msg);

    // 实例方法
    public native String instSayHello(String msg);

    public native int getTotalLengthOfStringArray(String[] strArr);

}
