package com.example.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.model.entity.Setmeal;
import org.apache.ibatis.annotations.Mapper;

/**
 * 数据层接口
 *
 * @Name SetmealMapper
 * @Author 舟鸿
 * @Date 2022-11-17 17:42
 */

@Mapper
public interface SetmealMapper extends BaseMapper<Setmeal> {
}
