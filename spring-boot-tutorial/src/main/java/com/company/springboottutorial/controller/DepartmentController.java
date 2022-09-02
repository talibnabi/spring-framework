package com.company.springboottutorial.controller;

import com.company.springboottutorial.service.inter.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/department")
@RequiredArgsConstructor
@CrossOrigin
public class DepartmentController {

    private DepartmentService departmentService;
}
