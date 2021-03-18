package com.ocp.day02;

public class Student {
    String name;
    int age;
    BMI bmi;
    Exam exam;
    
    
    Student(String name, int age, double height, double weight, int chinese, int math) {
        this.name = name;
        this.age = age;
        this.bmi = new BMI(name, height, weight);
        this.exam = new Exam(name, chinese, math);
    }
    
    void print(){
        System.out.printf("姓名:%s 年齡:%d\n",name ,age );
        bmi.print();
        
        if(exam == null){
            System.out.println("此學生無成績");
        }
        else{
            System.out.println(exam.getPrintData());
        }

        
    }


}
