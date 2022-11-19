package com.example.utils;

/**
 * 自定义业务异常
 *
 * @Name CustomException
 * @Author 舟鸿
 * @Date 2022-11-17 17:54
 */

public class CustomException extends RuntimeException{
    public CustomException(String message){
        super(message);
    }
}