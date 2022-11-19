package com.example.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.model.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

/**
 * 员工数据层接口
 *
 * @Name EmployeeMapper
 * @Author 舟鸿
 * @Date 2022-11-16-14-36
 */

@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {
}
