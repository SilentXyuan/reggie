package com.example.service.intf;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.model.dto.SetmealDto;
import com.example.model.entity.Setmeal;

/**
 * 接口
 *
 * @Name SetmealService
 * @Author 舟鸿
 * @Date 2022-11-17 17:43
 */

public interface SetmealService extends IService<Setmeal> {
    public void saveWithDish(SetmealDto setmealDto);

    public SetmealDto getByIdWithDish(Long id);

    public void updateWithDish(SetmealDto setmealDto);
}
