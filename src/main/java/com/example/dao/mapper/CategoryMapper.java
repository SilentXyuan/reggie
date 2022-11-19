package com.example.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.model.entity.Category;
import org.apache.ibatis.annotations.Mapper;

/**
 * 菜品分类数据层接口
 *
 * @Name CategoryMapper
 * @Author 舟鸿
 * @Date 2022-11-17 16:47
 */

@Mapper
public interface CategoryMapper extends BaseMapper<Category> {
}
