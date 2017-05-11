package com.zhangmin.aspectjdemo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author: ZhangMin
 * @date: 2017/5/11 13:54
 * @desc:
 */
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.CONSTRUCTOR, ElementType.METHOD})
public @interface DebugTrace {
}
