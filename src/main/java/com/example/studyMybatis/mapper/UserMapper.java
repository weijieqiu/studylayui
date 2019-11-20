package com.example.studyMybatis.mapper;

import com.example.studyMybatis.pojo.SysUser;

/**
 * @PackageName: com.example.studyMabatis.dao
 * @ClassName: UserMapper
 * @Description: TODO
 * @author: qiuweijie
 * @date: 2019/11/19  14:08
 */
public interface UserMapper {

    /**
     * 通过 id  查询用户
     * @param id
     * @return
     */
    SysUser selectById(Long id);
}
