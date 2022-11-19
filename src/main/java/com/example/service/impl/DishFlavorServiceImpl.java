package com.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.dao.mapper.DishFlavorMapper;
import com.example.model.entity.DishFlavor;
import com.example.service.intf.DishFlavorService;
import org.springframework.stereotype.Service;

/**
 * @Name DishFlavorMapperImpl
 * @Author 舟鸿
 * @Date 2022-11-18 11:00
 */

@Service
public class DishFlavorServiceImpl extends ServiceImpl<DishFlavorMapper, DishFlavor> implements DishFlavorService {
}
