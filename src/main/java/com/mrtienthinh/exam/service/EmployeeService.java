package com.mrtienthinh.exam.service;

import com.mrtienthinh.exam.entity.EmployeeEntity;

import java.util.List;

public interface EmployeeService {
    EmployeeEntity createEmployee(EmployeeEntity category);
    List<EmployeeEntity> findAllEmployees();
}
