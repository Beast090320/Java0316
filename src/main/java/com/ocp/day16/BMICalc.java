package com.ocp.day16;

public class BMICalc {
    public static void main(String[] args) {
        // Lambda 實作 Trangle 介面
        BMI B = (double h, double w) -> w / Math.pow(h/100, 2);
        System.out.println(B.getResult(170, 60));
    }
}
