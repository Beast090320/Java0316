package com.ocp.day06;

public class ArrayCV {
    public static void main(String[] args) {
        double[] nums = {10, 20, 30};
        double sum = 0;
        //求整合
        for(double n : nums ){// for-each
            //System.out.println(n); //使用 for-each 語法可以看到陣列或數組內容
            sum += n;
        }
        System.out.printf("sum: %.1f\n", sum);
        
        //求平均
        double avg = sum / nums.length;
        System.out.printf("avg: %.1f\n", avg);
        
        //求標準差 SD
        double sumOfSquares = 0;//平方和
        for(double n : nums){
            sumOfSquares += Math.pow(n - avg, 2);
        }
        System.out.printf("sumOfSquares: %.1f\n", sumOfSquares);
        double sd = Math.sqrt((1.0/nums.length) * sumOfSquares);
        System.out.printf("S.D: %.1f\n", sd);
        //變異係數 CV
        double cv = sd / avg;
        System.out.printf("C.V: %.1f\n", cv);
    }
}
