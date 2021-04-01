package com.ocp.day08;

public class MultiArrayDemo2 {

    public static void main(String[] args) {
        int[][] m = {{100, 90, 80}, {70, 60, 50}};
        System.out.println(m[0]);//[    I   @  2a139a55
        System.out.println(m[1]);//一維,整數,在,Hashcode雜湊碼
        int sum = 0;
        for (int[] x : m) {
            for (int y : x) {
                sum += y;
            }
        }
        System.out.println(sum);
    }
    
}