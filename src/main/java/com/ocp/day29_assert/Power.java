package com.ocp.day29_assert;

// P = IV
// 
public class Power {

    // 取得P , 方法 getW(int v, int a)
    public int getW(int v, int a) {

        return v * a;
    }
    // 取得I , 方法 getA(int w, int v)

    public int getA(int w, int v) {

        return w / v;
    }

    // 取得V , 方法 getV(int w, int a)
    public int getV(int w, int a) {

        return w / a;
    }
}
