package com.ocp.day10;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class PersonMain {

    public static void main(String[] args) {
        Person[] persons = {
            new Person("John", 17, 170, 60.5),
            new Person("Mary", 18, 160, 50.5),
            new Person("Joe", 19, 155, 42.5),
            new Person("Helan", 16, 185, 75.5),
            new Person("Tom", 21, 190, 120.5),};
        // 請印出未成年人名
        Stream.of(persons)
                .filter(p -> p.getAge() < 18)
                .forEach(p -> System.out.println(p.getName()));
        // 請印出BMI合格正常的人名(10 < BMI <=23)

        Stream.of(persons)
                .filter(p -> {
                    double bmi = p.getWeight() / Math.pow(p.getHeight() / 100, 2);
                    if (bmi > 18 && bmi <= 23) {
                        return true;
                    }
                    return false;
                })
                .forEach(p -> System.out.println(p.getName()));

        // 請印出BMI合格正常的人名(10 < BMI <=23) Part II
        // BMI正常合格的過濾邏輯(filter)先拆出來
        Predicate<Person> normalBmi = p -> {
            double bmi = p.getWeight() / Math.pow(p.getHeight() / 100, 2);
            if (bmi > 18 && bmi <= 23) {
                return true;
            }
            return false;
        };
        Predicate<Person> thinBmi = p -> {
            double bmi = p.getWeight() / Math.pow(p.getHeight() / 100, 2);
            if (bmi <= 18) {
                return true;
            }
            return false;
        };
        Predicate<Person> fatBmi = p -> {
            double bmi = p.getWeight() / Math.pow(p.getHeight() / 100, 2);
            if (bmi > 23) {
                return true;
            }
            return false;
        };
        Stream.of(persons)
                .filter(normalBmi)
                .forEach(p -> System.out.println(p.getName()));
    }
}
