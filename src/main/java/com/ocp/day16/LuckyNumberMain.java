package com.ocp.day16;

import java.util.Random;

public class LuckyNumberMain {

    public static void main(String[] args) {
        LuckyNumber num = () -> new Random().nextInt(9) + 1;
        System.out.println(num.get());

        LuckyNumber num2 = () -> {
            Random r = new Random();
            int n = r.nextInt(49) + 1;
            return n;
        };
        System.out.println(num.get());
    }
}
