package com.example.model.vo;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * 表现层协议实体类
 *
 * @Name Result
 * @Author 舟鸿
 * @Date 2022-11-16-16-29
 */

@Data
public class Result<T> {
    /**
     * 编码：1成功，0和其它数字为失败
     */
    private Integer code;

    /**
     * 错误信息
     */
    private String msg;

    /**
     * 数据
     */
    private T data;

    private Map map = new HashMap();

    public static <T> Result<T> success(T object) {
        Result<T> result = new Result<T>();
        result.data = object;
        result.code = 1;
        return result;
    }

    public static <T> Result<T> error(String msg) {
        Result result = new Result();
        result.msg = msg;
        result.code = 0;
        return result;
    }

    public Result<T> add(String key, Object value) {
        this.map.put(key, value);
        return this;
    }

}

