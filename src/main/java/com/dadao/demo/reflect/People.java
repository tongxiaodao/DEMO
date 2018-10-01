package com.dadao.demo.reflect;

/**
 * Created by tongxiaodao on 2018/10/1.
 */
public class People {
    private String name;
    private int age;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void speak() {
        System.out.println(getName() + " " + getAge());
    }
}