package com.example;

import com.example.model.entity.Employee;
import com.example.service.intf.EmployeeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ReggieApplicationTests {

    @Autowired
    private EmployeeService employeeService;

    @Test
    void contextLoads() {
    }

    @Test
    void test(){
        Employee id = employeeService.getById(1);
        System.out.println(id);

    }

}
