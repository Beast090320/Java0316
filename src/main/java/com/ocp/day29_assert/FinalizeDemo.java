package com.ocp.day29_assert;
// main -> 主執行緒, Finalizer -> 終結者
class Ball {

    // 建構子
    public Ball() {
        String thame = Thread.currentThread().getName();
        System.out.println("Ball 建立-棒球 : " + thame);
    }

    // 商業邏輯
    void play() {
        String thame = Thread.currentThread().getName();
        System.out.println("打棒球 : " + thame);
    }

    //Finalize
    @Override
    protected void finalize() throws Throwable {
        String thame = Thread.currentThread().getName();
        System.out.println("Ball 消失了 : " + thame);
    }
}

public class FinalizeDemo {

    public static void main(String[] args) {
        Ball b = new Ball();
        b.play();
        b = null;
        System.gc();
    }
}
