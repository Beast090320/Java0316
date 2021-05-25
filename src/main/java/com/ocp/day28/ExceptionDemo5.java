package com.ocp.day28;

public class ExceptionDemo5 {

    public static void main(String[] args) {

        int x = 0;
        
        try {
            int avg = 10 / x;
            System.out.println(avg);

        } catch (ArithmeticException e) {
            System.out.println(e);
            e.printStackTrace(System.out);

        } finally{
            System.out.println("程式結束: 這是一定要執行的");
        }
        

    }
}
