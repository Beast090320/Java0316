package com.ocp.day06;

public class MyMath {

    // 求總數
    public static double sum(double[] nums) {
        int sum = 0;
        for (double n : nums) {
            sum += n;
        }
        return sum;
    }

    // 求平均
    public static double avg(double[] nums) {
        double sum = sum(nums);
        double n = nums.length;
        double avg = sum / n;
        return avg;
    }

    // 求標準差
    public static double sd(double[] nums) {
        double avg = avg(nums);
        double sumOfSquares = 0;
        for (double n : nums) {
            sumOfSquares += Math.pow(n - avg, 2); // 平方和
        }
        int n = nums.length;
        double sd = Math.sqrt((1.0 / n) * sumOfSquares);
        return sd;
    }

    // 求變異係數
    public static double cv(double[] nums) {
        double avg = avg(nums);
        double sd = sd(nums);
        double cv = sd / avg;
        return cv;
    }

    public static double max(double[] nums) {
        double max = Double.MIN_VALUE;
        for (double n : nums) {
            if (n > max) {
                max = n;
            }
        }
        return max;
    }
    
    public static double min(double[] nums) {
        double min = Double.MAX_VALUE;
        for (double n : nums) {
            if (n < min) {
                min = n;
            }
        }
        return min;
    }

}
