package com.mrtienthinh.exam.controller;

import com.mrtienthinh.exam.entity.EmployeeEntity;
import com.mrtienthinh.exam.model.BaseResponse;
import com.mrtienthinh.exam.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping
    public BaseResponse getCategory(@RequestParam Map<String, String> params) {
        BaseResponse res = new BaseResponse();
        res.data = employeeService.findAllEmployees();
        return res;
    }

    @PostMapping
    public BaseResponse createCategory(@RequestBody EmployeeEntity employeeEntity) {
        BaseResponse res = new BaseResponse();
        res.data = employeeService.createEmployee(employeeEntity);
        return res;
    }
}
