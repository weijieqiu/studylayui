package com.example.studyMybatis.mapper;

import com.example.studyMybatis.pojo.SysRole;
import com.example.studyMybatis.pojo.SysUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

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

    /**
     * 查询全部用户
     * @return
     */
    List<SysUser> selectAll();

    List<SysRole> selectRoleByUserId(Long userId);

    /**
     * 新增用户
     * @param sysUser
     * @return
     */
    int insert(SysUser sysUser);


    /**
     * 通过主键删除
     * @param id
     * @return
     */
    int deleteById(Long id);


    SysRole selectRolesByUserIdAndRoleEnabled(@Param("userId") Long userId, @Param("enabled") Integer enabled);

    List<SysUser> selectByUser(SysUser sysUser);

    /**
     * 根据主键更新
     * @param sysUser
     * @return
     */
    int updateByIdSelective(SysUser sysUser);

    List<SysUser> selectAllUserAndRoles();
}
