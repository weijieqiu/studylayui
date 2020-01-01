package com.example.studyjwt.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @PackageName: com.example.studyjwt.annotation
 * @ClassName: UserLoginToken
 * @Description: 该注解表示需要使用 Token
 * @author: qiuweijie
 * @date: 2020/1/1  14:24
 */
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface UserLoginToken {
    boolean required() default true;
}
