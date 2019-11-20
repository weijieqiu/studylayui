package com.example.studyMybatis.pojo;

/**
 * @PackageName: com.example.studyMabatis.pojo
 * @ClassName: SysPrivilege
 * @Description: 权限表
 * @author: qiuweijie
 * @date: 2019/11/19  12:45
 */
public class SysPrivilege {
    /**
     * 权限 ID
     */
    private Long id;
    /**
     * 权限名称
     */
    private String privilegeName;
    /**
     * 权限URL
     */
    private String privilegeUrl;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPrivilegeName() {
        return privilegeName;
    }

    public void setPrivilegeName(String privilegeName) {
        this.privilegeName = privilegeName;
    }

    public String getPrivilegeUrl() {
        return privilegeUrl;
    }

    public void setPrivilegeUrl(String privilegeUrl) {
        this.privilegeUrl = privilegeUrl;
    }
}
