package com.ocp.day31_thread;

import java.util.LinkedHashMap;
import java.util.Map;

class Ball {

    private int max = 1000;

    public synchronized void get() {
        synchronized (this) {
            if (max > 0) {
                String name = Thread.currentThread().getName();
                System.out.printf("%s 取到第 %d 顆球\n", name, max);
                max--;
                GetBall.map.put(name, GetBall.map.getOrDefault(name, 0) + 1);
            }
        }

    }
}

class BallThread extends Thread {

    private Ball ball;

    public BallThread(Ball ball) {
        this.ball = ball;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            ball.get();
        }
        System.out.println(GetBall.map);
    }

}

public class GetBall {
    static Map<String, Integer> map = new LinkedHashMap<>();
    
    public static void main(String[] args) {
        Ball ball = new Ball();
        for (int i = 0; i <= 10; i++) {
        new BallThread(ball).start();    
        }
        
        

    }
}
