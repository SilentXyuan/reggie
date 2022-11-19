package com.example.model.dto;

import com.example.model.entity.Dish;
import com.example.model.entity.DishFlavor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * 展示层与服务层之间的数据传输
 *
 * @Name DishDto
 * @Author 舟鸿
 * @Date 2022-11-18 11:10
 */

@Data
public class DishDto extends Dish {
    private List<DishFlavor> flavors = new ArrayList<>();

    private String categoryName;

    private Integer copies;
}
