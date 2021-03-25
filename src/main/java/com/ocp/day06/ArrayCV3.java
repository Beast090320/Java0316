package com.ocp.day06;

import java.util.Arrays;


/*1.調查五位學生之身高及體重如下，試比較其分散程度。
            身高：172、168、164、170、176(公分)
            體重：62、57、58、64、64(公斤)*/
public class ArrayCV3 {

    public static void main(String[] args) {
        double[] h = {172, 168, 164, 170, 176};
        double[] w = {62, 57, 58, 64, 64};
        double h_cv = MyMath.cv(h);
        double w_cv = MyMath.cv(w);
        System.out.printf("身高陣列: %s\n", Arrays.toString(h));
        System.out.printf("身高總數: %.1f 身高平均: %.1f 身高標準差: %.1f 身高變異係數: %.1f\n",
                MyMath.sum(h),
                MyMath.avg(h),
                MyMath.sd(h),
                h_cv * 100);
        System.out.printf("體重陣列: %s\n", Arrays.toString(w));
        System.out.printf("體重總數: %.1f 體重平均: %.1f 體重標準差: %.1f 體重變異係數: %.1f\n",
                MyMath.sum(w),
                MyMath.avg(w),
                MyMath.sd(w),
                w_cv * 100);

        String result = (h_cv < w_cv) ? "身高" : "體重";
        System.out.printf("身高cv: %.2f%% 體重: %.2f%% 「%s」集中度較高", h_cv * 100, w_cv * 100, result);
    }
}
