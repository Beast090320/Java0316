/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp.day08;

/**
 *
 * @author MB-study
 */
public class MultiArrayDemo4 {
    public static void main(String[] args) {
        //3人的身高與體重如下:
        double[][] hw = {{170, 160, 180}, {60, 45, 90}};
        //求3人的BMI
        print(hw);
        
    }
        public static void print(double[][] hw) {
        for (double[] x : hw) {
            double h = x[0];
            double w = x[1];
            double bmi = w/Math.pow(h/100, 2);
            for (double y : x) {
                System.out.println(y);
                
            }
            System.out.printf("%.2f\n", bmi);
            System.out.println();
        }
    }
}

