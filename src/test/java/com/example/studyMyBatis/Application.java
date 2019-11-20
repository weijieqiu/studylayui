package com.example.studyMyBatis;

import com.example.studyMybatis.mapper.UserMapper;
import com.example.studyMybatis.pojo.SysUser;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;

/**
 * @PackageName: com.example.studyMyBatis
 * @ClassName: Application
 * @Description: TODO
 * @author: qiuweijie
 * @date: 2019/11/19  14:23
 */

@SpringBootApplication
@MapperScan("com.example.studyMybatis.mapper")
public class Application implements CommandLineRunner {

    @Resource
    private UserMapper userMapper;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    @Override
    public void run(String... args) throws Exception {
        SysUser sysUser = userMapper.selectById(1L);
        System.out.println(sysUser.getCreateTime());
    }
}
