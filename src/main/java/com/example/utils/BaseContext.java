package com.example.utils;

/**
 * 单线程局部变量
 *
 * @Name BaseContext
 * @Author 舟鸿
 * @Date 2022-11-17 16:28
 */

public class BaseContext {
    private static ThreadLocal<Long> threadLocal=new ThreadLocal<>();

    public static void setCurrentId(Long id){
        threadLocal.set(id);
    }

    public static Long getCurrentId(){
        return threadLocal.get();
    }
}
