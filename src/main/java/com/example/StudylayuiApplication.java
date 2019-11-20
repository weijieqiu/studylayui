package com.example;

import com.example.studyMybatis.mapper.UserMapper;
import com.example.studyMybatis.pojo.SysRole;
import com.example.studyMybatis.pojo.SysUser;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
@MapperScan("com.example.studyMybatis.mapper")
public class StudylayuiApplication implements CommandLineRunner {

    @Autowired
    private UserMapper userMapper;

    public static void main(String[] args) {
        SpringApplication.run(StudylayuiApplication.class, args);
    }

    /**
     * 测试 myBatis 方法 参考 《MyBatis 从入门到精通》 写的
     * @param args
     * @throws Exception
     */
    @Override
    public void run(String... args) throws Exception {
        //SysUser sysUser = userMapper.selectById(1L);
        //System.out.println(sysUser.toString());
        //List<SysUser> userList = userMapper.selectAll();
        //for (SysUser sysUser1 : userList){
        //    System.out.println(sysUser1);
        //}
        testSelectRoleByUserId();

    }


    public void testSelectRoleByUserId() {
        List<SysRole> roleList = userMapper.selectRoleByUserId(1L);
        System.out.println(roleList);
    }
}
