package com.example.studyLombok;

import lombok.extern.slf4j.Slf4j;

/**
 * @PackageName: com.example.studyLombok
 * @ClassName: UseSlf4j
 * @Description: TODO
 * @author: qiuweijie
 * @date: 2019/12/20  9:39
 */
@Slf4j
public class UseSlf4j {

    public static void main(String[] args) {
        log.info("使用lombox 注解实现日志的使用");
        log.debug("使用lombox 注解实现日志的使用");
        log.error("使用lombox 注解实现日志的使用");
    }
}
