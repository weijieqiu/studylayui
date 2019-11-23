package com.example.studyMybatis.mapper;

import com.example.studyMybatis.pojo.SysRole;

import java.util.List;

/**
 * @PackageName: com.example.studyMybatis.mapper
 * @ClassName: RoleMapper
 * @Description: 角色映射类
 * @author: qiuweijie
 * @date: 2019/11/23  9:52
 */
public interface RoleMapper {

    /**
     * 查询所有角色
     * @return
     */
    List<SysRole> getAllSysRole();

    /**
     * 查询所有角色下的所有权限，一对多关系
     * @return
     */
    List<SysRole> getAllRoleAndPrivilege();
}
