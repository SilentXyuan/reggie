package com.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.dao.mapper.EmployeeMapper;
import com.example.model.entity.Employee;
import com.example.service.intf.EmployeeService;
import org.springframework.stereotype.Service;

/**
 * @Name EmployeeServiceImpl
 * @Author 舟鸿
 * @Date 2022-11-16-14-38
 */

@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {
}
