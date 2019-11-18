package com.example.designpattern.proxy;

import org.junit.jupiter.api.Test;

/**
 * @PackageName: com.example.designpattern.proxy
 * @ClassName: TeacherLeader
 * @Description: 管理老师的类，类似于年段长
 */
public class TeacherLeader {

    /**
     * @Description: 安排一下咯
     */
    @Test
    public void arrange(){
        Teacher teacher = new Teacher();
        TeacherProxy teacherProxy = new TeacherProxy(teacher);
        teacherProxy.teaching();
    }
}
