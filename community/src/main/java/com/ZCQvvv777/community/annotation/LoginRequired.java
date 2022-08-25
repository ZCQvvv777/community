package com.ZCQvvv777.community.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Description 检查登录状态
 * @Date 2022/8/25 12:33
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)// 程序运行时有效
public @interface LoginRequired {

}
