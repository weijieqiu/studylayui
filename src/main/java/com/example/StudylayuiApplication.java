package com.example;

import com.example.studyMybatis.mapper.UserMapper;
import com.example.studyMybatis.pojo.SysUser;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.studyMybatis.mapper")
public class StudylayuiApplication implements CommandLineRunner {

    @Autowired
    private UserMapper userMapper;

    public static void main(String[] args) {
        SpringApplication.run(StudylayuiApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        SysUser sysUser = userMapper.selectById(1L);
        System.out.println(sysUser.toString());
    }
}
