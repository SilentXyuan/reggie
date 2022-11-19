package com.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.dao.mapper.SetmealMapper;
import com.example.model.entity.Setmeal;
import com.example.service.intf.SetmealService;
import org.springframework.stereotype.Service;

/**
 * @Name SetmealServiceImpl
 * @Author 舟鸿
 * @Date 2022-11-17 17:44
 */

@Service
public class SetmealServiceImpl extends ServiceImpl<SetmealMapper, Setmeal> implements SetmealService {
}
