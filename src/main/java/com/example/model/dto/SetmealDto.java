package com.example.model.dto;

import com.example.model.entity.Setmeal;
import com.example.model.entity.SetmealDish;
import lombok.Data;

import java.util.List;

/**
 * dto
 *
 * @Name SetmealDto
 * @Author 舟鸿
 * @Date 2022-11-19 10:42
 */

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
