package com.example.service.intf;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.model.dto.DishDto;
import com.example.model.entity.Dish;

/**
 * 菜品接口
 *
 * @Name DishService
 * @Author 舟鸿
 * @Date 2022-11-17 17:38
 */

public interface DishService extends IService<Dish> {
    /**
     * 保存
     * @param dishDto
     */
    public void saveWithFlavor(DishDto dishDto);

    /**
     * 连表查询
     * @param id
     * @return
     */
    public DishDto getByIdWithFlavor(Long id);

    /**
     * 更新
     * @param dishDto
     */
    public void updateWithFlavor(DishDto dishDto);
}
