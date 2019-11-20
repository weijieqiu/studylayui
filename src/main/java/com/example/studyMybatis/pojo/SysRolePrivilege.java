package com.example.studyMybatis.pojo;

/**
 * @PackageName: com.example.studyMabatis.pojo
 * @ClassName: SysRolePrivilege
 * @Description: 角色权限表
 * @author: qiuweijie
 * @date: 2019/11/19  12:43
 */
public class SysRolePrivilege {
    /**
     * 角色 ID
     */
    private Long roleId;

    /**
     * 权限 ID
     */
    private Long privilegeId;

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getPrivilegeId() {
        return privilegeId;
    }

    public void setPrivilegeId(Long privilegeId) {
        this.privilegeId = privilegeId;
    }
}
