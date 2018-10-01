package com.dadao.demo.reflect;

/**
 * Created by tongxiaodao on 2018/10/1.
 */
public class Student extends People {
    private int grade;
    private String name;
    public Student(String name, int age) {
        super(name, age);
    }
    public Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }
    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }
    private void learn(String course) {
        System.out.println(name + " learn " + course);
    }
}
