package com.example.studyMybatis.mapper;

import com.example.studyMybatis.pojo.SysRole;
import com.example.studyMybatis.pojo.SysUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @PackageName: com.example.studyMabatis.dao
 * @ClassName: UserMapper
 * @Description: 用户映射类
 * @author: qiuweijie
 * @date: 2019/11/19  14:08
 */
public interface UserMapper {



    /**
     * 通过 id 查用户
     * @param id
     * @return
     */
    SysUser selectByid(Long id);

    /**
     * 查询所有用户拥有的所有角色，一对多关系
     * @return
     */
    List<SysUser> selectAllUserAndRoles();

    /**
     * 查询所有用户对应的所有角色与所有权限，一对多，一对多关系
     * @return
     */
    List<SysUser> selectAllUserAndRoleAndPrivilege();

    /**
     * MyBatis 动态 SQL if 的使用
     */
    List<SysUser> selectByUser(SysUser sysUser);

    /**
     * 根据主键更新
     *
     * @param sysUser
     * @return
     */
    int updateByIdSelective(SysUser sysUser);


}
