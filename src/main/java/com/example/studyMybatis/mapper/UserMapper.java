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
     * 查询所有用户拥有的所有角色，一对多关系
     * @return
     */
    List<SysUser> selectAllUserAndRoles();
}
