package com.mrtienthinh.exam.controller;

import com.mrtienthinh.exam.entity.EmployeeEntity;
import com.mrtienthinh.exam.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class WebController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping({"/", "/index"})
    public String index(Model model) {
        List<EmployeeEntity> employees = employeeService.findAllEmployees();
        model.addAttribute("employees", employees);
        return "index";
    }

    @GetMapping({"/create"})
    public String create(Model model) {
        return "create";
    }
}
