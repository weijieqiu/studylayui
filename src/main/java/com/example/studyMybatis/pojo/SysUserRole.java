package com.example.studyMybatis.pojo;

/**
 * @PackageName: com.example.studyMabatis.pojo
 * @ClassName: SysUserRole
 * @Description: 用户角色关联表
 * @author: qiuweijie
 * @date: 2019/11/19  12:41
 */
public class SysUserRole {
    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 角色ID
     */
    private Long roleId;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
}
