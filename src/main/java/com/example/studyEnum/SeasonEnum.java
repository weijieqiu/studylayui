package com.example.studyEnum;

/**
 * @PackageName: com.example.studyEnum
 * @ClassName: SeasonEnum
 * @Description: TODO
 * @author: qiuweijie
 * @date: 2019/12/26  10:52
 */
public enum SeasonEnum {
    SPRING("春"),SUMMER("夏"),FALL("秋"),WINTER("冬");

    private String name;

    SeasonEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
