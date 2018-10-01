package com.dadao.demo.reflect;

import java.lang.reflect.Constructor;

/**
 * Created by tongxiaodao on 2018/10/1.
 */
public class Demo {

    public static void main(String[] args) {
        Class<People> pClass = People.class;
        try {
            Constructor<People> constructor = pClass.getConstructor(String.class, int.class);
            People people = constructor.newInstance("Bill", 18);
            people.speak();
        } catch (Exception e) {
        }
    }

}
