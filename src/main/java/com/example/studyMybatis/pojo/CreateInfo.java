package com.example.studyMybatis.pojo;

import java.util.Date;

/**
 * @PackageName: com.example.studyMybatis.pojo
 * @ClassName: CreateInfo
 * @Description: 创建i西南西
 * @author: qiuweijie
 * @date: 2019/11/23  14:52
 */
public class CreateInfo {
    /**
     * 创建人
     */
    private String  createBy;

    /**
     * 创建时间
     */
    private Date createTime;

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
