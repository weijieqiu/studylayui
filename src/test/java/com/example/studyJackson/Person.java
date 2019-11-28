package com.example.studyJackson;

import java.io.Serializable;

/**
 * @PackageName: com.example.studyJackson
 * @ClassName: Person
 * @Description: TODO
 * @author: qiuweijie
 * @date: 2019/11/26  11:14
 */
public class Person implements Serializable {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
