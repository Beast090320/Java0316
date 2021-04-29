package com.ocp.day17;

import java.util.DoubleSummaryStatistics;
import java.util.stream.Stream;

public class LambdaDemo2 {

    public static void main(String[] args) {
        // 求此人總分與總平均 = ?
        //.peek(x -> System.out.println(x.getClass().getTypeName())) // Consumer
        //.forEach(System.out::println);
        DoubleSummaryStatistics stat = Stream.of("國文", 100.0, "英文", 90.5, "數學", 70.5, "座號", 7)
                .filter(x -> x instanceof Double) // 過濾資料剩Double
                .mapToDouble(x -> (double)x) // 物件Double 轉基本 Double 才會變成 DoubleStream
                .summaryStatistics();
        
        System.out.println(stat.getSum());
        System.out.println(stat.getAverage());
    }
}
