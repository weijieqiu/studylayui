package com.example;

import com.example.studyMybatis.mapper.UserMapper;
import com.example.studyMybatis.pojo.SysRole;
import com.example.studyMybatis.pojo.SysUser;
import com.example.studyMybatis.pojo.SysUserRole;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
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
        //testDeleteById();
        //testUpdateByIdSelective();
        testSelectAllUserAndRoles();
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

    public void testDeleteById(){
        SysUser user = userMapper.selectById(1001L);
        int num =  userMapper.deleteById(user.getId());
    }

    public void testUpdateByIdSelective(){
        SysUser user = new SysUser();
        user.setId(1L);
        user.setUserEmail("test@mybatis.tk");
        int result = userMapper.updateByIdSelective(user);
    }

    /**
     * 测试查询所有的用户名和角色
     */
    public void testSelectAllUserAndRoles() {
        List<SysUser> sysUsers =  userMapper.selectAllUserAndRoles();

        for (SysUser sysUser: sysUsers){
            System.out.println(sysUser);
            List<SysRole> sysRoles = sysUser.getRoleList();
            for (SysRole sysRole: sysRoles){
                System.out.println(sysRole);
            }
        }
        //System.out.println("用户数: " + userList.size());
        //for(SysUser sysUser: userList ){
        //    System.out.println("用户名: " + sysUser.getRoleList());
        //}

    }

}
