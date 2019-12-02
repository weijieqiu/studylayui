package com.example.studyMybatis.enums;

/**
 * @PackageName: com.example.studyMybatis.type
 * @ClassName: Enabled
 * @Description: TODO
 * @author: qiuweijie
 * @date: 2019/11/28  11:32
 */
public enum Enabled {
    disabled(0),   // 禁用
    enabled(1);    // 启用

    private final int value;

    Enabled(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
