package com.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.dao.mapper.SetmealDishMapper;
import com.example.model.entity.SetmealDish;
import com.example.service.intf.SetmealDishService;
import org.springframework.stereotype.Service;

/**
 * @Name SetmealDishServiceImpl
 * @Author 舟鸿
 * @Date 2022-11-19 10:47
 */

@Service
public class SetmealDishServiceImpl extends ServiceImpl<SetmealDishMapper, SetmealDish> implements SetmealDishService {
}
