package com.ocp.day11;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class ExtendsDemo {

    public static void main(String[] args) {
        // 操作 Employee, Manager, Director
        Employee e1 = new Employee();
        e1.setSalary(30000);
        Employee e2 = new Employee();
        e2.setSalary(40000);
        Employee e3 = new Employee();
        e3.setSalary(50000);
        //----------------------------------
        Manager m1 = new Manager();
        m1.setSalary(7_0000);
        m1.setBudget(10_0000);
        Manager m2 = new Manager();
        m2.setSalary(8_0000);
        m2.setBudget(15_0000);
        //----------------------------------
        Director d1 = new Director();
        d1.setSalary(20_0000);
        d1.setBudget(50_0000);
        d1.setStockOption(300_0000);
        //----------------------------------
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(d1);
        //----------------------------------
        // 請問總薪資是多少 ?
        System.out.println("請問總薪資(salary)是多少 ?");
        Employee[] employees = {e1, e2, e3, m1, m2, d1};
        //Java 7 (for-loop)
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            //System.out.println(employees[i]);
            sum += employees[i].getSalary();
        }
        System.out.printf("總薪資: %,d\n", sum);
        //Java 7 (for-each)
        int sum2 = 0;
        
        for(Employee e : employees) {
            sum2 += e.getSalary();
        }
        System.out.printf("總薪資: %,d\n", sum2);
        /*Java 8 
        1.加入(Stream.of)串流 
        2.轉換Employee -> 整數getSalary() mapToInt(e -> e.getSalary)
          也就是轉換為特殊串流 IntStream -> sum()
        */
        int sum3 = Stream.of(employees).mapToInt(e -> e.getSalary()).sum();
        System.out.printf("總薪資: %,d\n", sum3);
        //Java 8 (使用方法參考 ::) 程式會自動轉換為定義裡的東西
        int sum4 = Stream.of(employees).mapToInt(Employee::getSalary).sum();
        System.out.printf("總薪資: %,d\n", sum4);
        
    }   
}
