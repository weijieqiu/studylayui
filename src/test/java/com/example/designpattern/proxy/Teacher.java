package com.example.designpattern.proxy;

/**
 * @Description: 老师类
 */
public class Teacher implements ITeacher{
    @Override
    public void teaching() {
        System.out.println("讲知识....");
    }
}
