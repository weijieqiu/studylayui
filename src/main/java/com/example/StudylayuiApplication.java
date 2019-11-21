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

import java.util.Date;
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
        testInsert();

    }


    public void testSelectRoleByUserId() {
        List<SysRole> roleList = userMapper.selectRoleByUserId(1L);
        System.out.println(roleList);
    }


    public void testInsert(){
        SysUser user = new SysUser();
        user.setUserName("test1");
        user.setUserPassword("123456");
        user.setUserEmail("test@mybatis.tk");
        user.setUserInfo("test info");
        user.setHeadImg(new byte[]{1, 2, 3});
        user.setCreateTime(new Date());
        int result = userMapper.insert(user);
    }
}
