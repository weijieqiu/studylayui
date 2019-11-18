package com.example.designpattern.proxy;

/**
 * @Description: 代理老师类
 */
public class TeacherProxy implements ITeacher{

    private Teacher teacher;

    public TeacherProxy(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public void teaching() {
        System.out.println("我是代课老师开始讲这节课知识");
        // 这里的知识点是从编内老师那边学到的
        teacher.teaching();
        System.out.println("我是代课老师讲完这节课知识");

    }
}
