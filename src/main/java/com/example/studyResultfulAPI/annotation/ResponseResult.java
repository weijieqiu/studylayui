package com.example.studyResultfulAPI.annotation;

import java.lang.annotation.*;

/**
 * @PackageName: com.example.studyResultfulAPI.annotation
 * @ClassName: ResponseResult
 * @Description: TODO
 * @author: qiuweijie
 * @date: 2019/12/11  9:34
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.TYPE})
@Documented
public @interface ResponseResult {

}
