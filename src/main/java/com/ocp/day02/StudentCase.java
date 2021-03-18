package com.ocp.day02;

public class StudentCase {
    public static void main(String[] args) {
        Student s1 = new Student("小明", 18, 170, 60);
        s1.exam = new Exam("小明", 90, 80);
        s1.print();
        System.out.println(s1.bmi.getBMIValue());
        System.out.println(s1.exam.getAvg());
        
    }
}
