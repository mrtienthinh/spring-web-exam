package com.mrtienthinh.exam.service;

import com.mrtienthinh.exam.entity.EmployeeEntity;
import com.mrtienthinh.exam.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeRepo employeeRepo;

    @Override
    public EmployeeEntity createEmployee(EmployeeEntity employeeEntity) {
        EmployeeEntity employee = employeeRepo.save(employeeEntity);
        return employee;
    }

    @Override
    public List<EmployeeEntity> findAllEmployees() {
        return employeeRepo.findAll();
    }
}
