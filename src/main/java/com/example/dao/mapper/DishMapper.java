package com.example.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.model.entity.Dish;
import org.apache.ibatis.annotations.Mapper;

/**
 * 菜品数据层
 *
 * @Name DishMapper
 * @Author 舟鸿
 * @Date 2022-11-17 17:38
 */

@Mapper
public interface DishMapper extends BaseMapper<Dish> {
}
