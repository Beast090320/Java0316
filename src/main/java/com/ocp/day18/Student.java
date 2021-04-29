package com.ocp.day18;

public class Student extends Person {
    private int score;
    private Teacher Teacher;

    public Student() {
    }

    public Student(int score, Teacher Teacher, String name, int age) {
        super(name, age);
        this.score = score;
        this.Teacher = Teacher;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Teacher getTeacher() {
        return Teacher;
    }

    public void setTeacher(Teacher Teacher) {
        this.Teacher = Teacher;
    }

    @Override
    public String toString() {
        return "Student{" + "score=" + score + ", Teacher=" + Teacher + '}';
    }


}