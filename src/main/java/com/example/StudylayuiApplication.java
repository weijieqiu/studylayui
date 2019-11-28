package com.example;

import com.example.studyMybatis.mapper.RoleMapper;
import com.example.studyMybatis.mapper.UserMapper;
import com.example.studyMybatis.pojo.SysPrivilege;
import com.example.studyMybatis.pojo.SysRole;
import com.example.studyMybatis.pojo.SysUser;
import com.example.studyMybatis.pojo.SysUserRole;
import com.example.studyMybatis.type.Enabled;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.management.relation.Role;
import java.util.Date;
import java.util.List;

@SpringBootApplication
@MapperScan("com.example.studyMybatis.mapper")
public class StudylayuiApplication implements CommandLineRunner {

    private final static Logger logger = LoggerFactory.getLogger(StudylayuiApplication.class);


    @Autowired
    private UserMapper userMapper;
    @Autowired
    private RoleMapper roleMapper;

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
        //testSelectAllUserAndRoles();
        //testGetAllSysRole();
        //testGetAllRoleAndPrivilege();
        //testSelectAllUserAndRoles();
        //testGetAllRoleAndPrivilege();
        //testSelectAllUserAndRoleAndPrivilege();
        testUpdateById();
    }

    private void testSelectAllUserAndRoleAndPrivilege() {

        List<SysUser> sysUserList = userMapper.selectAllUserAndRoleAndPrivilege();
        for(SysUser sysUser : sysUserList){
            logger.debug("用户名:" + sysUser.getUserName());
            List<SysRole> sysRoleList = sysUser.getRoleList();
            for(SysRole sysRole : sysRoleList){
                logger.debug("角色名: "+sysRole.getRoleName());
                List<SysPrivilege> sysPrivilegeList = sysRole.getSysPrivilegeList();
                for (SysPrivilege sysPrivilege : sysPrivilegeList){
                    logger.debug("权限信息: " + sysPrivilege.getPrivilegeName() + sysPrivilege.getPrivilegeUrl());

                }
            }
        }
    }


    //public void testSelectRoleByUserId() {
    //    List<SysRole> roleList = userMapper.selectRoleByUserId(1L);
    //    System.out.println(roleList);
    //}
    //
    //
    //public void testInsert(){
    //    SysUser user = new SysUser();
    //    user.setUserName("test1");
    //    user.setUserPassword("123456");
    //    user.setUserEmail("test@mybatis.tk");
    //    user.setUserInfo("test info");
    //    user.setHeadImg(new byte[]{1, 2, 3});
    //    user.setCreateTime(new Date());
    //    int result = userMapper.insert(user);
    //}
    //
    //public void testDeleteById(){
    //    SysUser user = userMapper.selectById(1001L);
    //    int num =  userMapper.deleteById(user.getId());
    //}
    //
    //public void testUpdateByIdSelective(){
    //    SysUser user = new SysUser();
    //    user.setId(1L);
    //    user.setUserEmail("test@mybatis.tk");
    //    int result = userMapper.updateByIdSelective(user);
    //}

    /**
     * 查询所有角色
     */
    public void testGetAllSysRole(){
        List<SysRole> sysRoleList = roleMapper.getAllSysRole();
        for (SysRole sysRole :sysRoleList){
            logger.debug(sysRole.getRoleName());
        }
    }

    /**
     * 测试查询所有的用户名和角色
     */
    public void testSelectAllUserAndRoles() {
        List<SysUser> sysUsers =  userMapper.selectAllUserAndRoles();
        for (SysUser sysUser: sysUsers){
            logger.debug("用户名:" + sysUser.getUserName());
            List<SysRole> sysRoles = sysUser.getRoleList();
            for (SysRole sysRole: sysRoles){
                logger.debug("角色名:" + sysRole.getRoleName());
            }
        }
        //System.out.println("用户数: " + userList.size());
        //for(SysUser sysUser: userList ){
        //    System.out.println("用户名: " + sysUser.getRoleList());
        //}

    }


    /**
     * 测试查询所有角色下的权限
     */
    public void testGetAllRoleAndPrivilege(){
        List<SysRole> sysRoleList = roleMapper.getAllRoleAndPrivilege();
        logger.debug(String.valueOf(sysRoleList));
        for(SysRole sysRole :sysRoleList){
            List<SysPrivilege> sysPrivilegeList = sysRole.getSysPrivilegeList();
            logger.debug(sysRole.getRoleName());
            for (SysPrivilege sysPrivilege:sysPrivilegeList){
                logger.debug(sysPrivilege.getPrivilegeName() +sysPrivilege.getPrivilegeUrl());
            }
        }

    }

    /**
     * 测试枚举更新
     */
    public void testUpdateById(){
        List<SysRole> sysRoleList = roleMapper.selectByid(2L);
        for(SysRole sysRole: sysRoleList){
           Enum e = sysRole.getEnabled();

            logger.debug(String.valueOf(e));
        }

    }

}
