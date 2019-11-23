package com.example.studyMybatis.pojo;

import java.util.Date;
import java.util.List;

/**
 * @PackageName: com.example.studyMabatis.pojo
 * @ClassName: SysRole
 * @Description:  角色表
 * @author: qiuweijie
 * @date: 2019/11/19  12:35
 */
public class SysRole {
    /**
     * 角色ID
     */
    private Long id;

    /**
     * 角色名
     */
    private String roleName;

    /**
     * 有效标志
     */
    private Integer enabled;

    ///**
    // * 创建人
    // */
    //private Long createBy;
    //
    ///**
    // * 创建时间
    // */
    //private Date createTime;

    private CreateInfo createInfo;

    private List<SysPrivilege> sysPrivilegeList;

    public List<SysPrivilege> getSysPrivilegeList() {
        return sysPrivilegeList;
    }

    public void setSysPrivilegeList(List<SysPrivilege> sysPrivilegeList) {
        this.sysPrivilegeList = sysPrivilegeList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Integer getEnabled() {
        return enabled;
    }

    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    //public Long getCreateBy() {
    //    return createBy;
    //}
    //
    //public void setCreateBy(Long createBy) {
    //    this.createBy = createBy;
    //}
    //
    //public Date getCreateTime() {
    //    return createTime;
    //}
    //
    //public void setCreateTime(Date createTime) {
    //    this.createTime = createTime;
    //}

    public CreateInfo getCreateInfo() {
        return createInfo;
    }

    public void setCreateInfo(CreateInfo createInfo) {
        this.createInfo = createInfo;
    }
}
