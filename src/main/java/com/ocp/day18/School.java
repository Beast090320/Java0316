package com.ocp.day18;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class School {
    public static void main(String[] args) {
        
        IntSummaryStatistics state = Arrays.stream(DataCenter.getPeople())
                .filter(x -> x instanceof Student)
                .map(x -> (Student)x)
                .mapToInt(x -> x.getScore()) // 由Person 轉型 Student               
                .summaryStatistics();
        System.out.printf("學生成績總和:%d\n",state.getSum());
        System.out.printf("學生成績平均:%f\n",state.getAverage());
        // 請問老師薪資總和與平均
        IntSummaryStatistics stat = Arrays.stream(DataCenter.getPeople())
                .filter(x -> x instanceof Teacher)
                .map(x -> (Teacher)x)
                .mapToInt(x -> x.getSalary()) // 由Person 轉型 Student               
                .summaryStatistics();
        System.out.printf("老師月薪總和:%d\n",stat.getSum());
        System.out.printf("老師月薪平均:%f\n",stat.getAverage());
        // 不及格總平均與不及格學生和教學老師姓名
        Consumer<Student> p = x -> System.out.printf("不及格學生:%s, 分數:%d, 老師:%s\n", x.getName(), x.getScore(), x.getTeacher().getName()); 
        double avg = Arrays.stream(DataCenter.getPeople())
                .filter(x -> x instanceof Student)
                .map(x -> (Student)x)
                .filter(x -> x.getScore() < 60)
                .peek(p)
                .mapToInt(Student::getScore)
                .average()
                .getAsDouble();
        System.out.println("不及格學生平均: " + avg);
                
                
    }
}
