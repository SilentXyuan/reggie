package com.example.service.intf;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.model.entity.Category;

/**
 * 业务层接口
 *
 * @Name CategoryService
 * @Author 舟鸿
 * @Date 2022-11-17 16:48
 */

public interface CategoryService extends IService<Category> {
    public void remove(Long id);
}
