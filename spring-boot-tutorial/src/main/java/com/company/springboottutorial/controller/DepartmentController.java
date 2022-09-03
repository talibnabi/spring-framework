package com.company.springboottutorial.controller;

import com.company.springboottutorial.entity.Department;
import com.company.springboottutorial.service.inter.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/department")
@RequiredArgsConstructor
@CrossOrigin
public class DepartmentController {

    private final DepartmentService departmentService;
    private final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);


    @GetMapping("/getAllDepartment")
    public List<Department> getAllDepartment() {
        LOGGER.info("Inside getAllDepartment of DepartmentController");
        return departmentService.getAllDepartment();
    }

    @GetMapping("/getByDepartmentName/name/{name}")
    public Department getByDepartmentName(@PathVariable("name") String departmentName) {
        LOGGER.info("Inside getByDepartmentName of DepartmentController");
        return departmentService.findDepartmentByDepartmentName(departmentName);
    }

    @GetMapping("/getByDepartmentName/nameIgnoreCase/{name}")
    public Department getByDepartmentNameIgnoreCase(@PathVariable("name") String departmentName) {
        LOGGER.info("Inside getByDepartmentNameIgnoreCase of DepartmentController");
        return departmentService.findDepartmentByDepartmentNameIgnoreCase(departmentName);
    }

    @GetMapping("/getDepartment/{id}")
    public Department getDepartment(@PathVariable("id") Long id) {
        LOGGER.info("Inside getDepartment of DepartmentController");
        return departmentService.getDepartment(id);
    }

    @PostMapping("/save")
    public Department saveDepartment(@Valid @RequestBody Department department) {
        LOGGER.info("Inside saveDepartment of DepartmentController");
        return departmentService.saveDepartment(department);
    }

    @DeleteMapping("/deleteDepartment/{id}")
    public String deleteDepartment(@PathVariable("id") Long id) {
        LOGGER.info("Inside deleteDepartment of DepartmentController");
        departmentService.deleteDepartment(id);
        return "Department was deleted.";
    }

    @PutMapping("/updateDepartment/{id}")
    public String updateDepartment(@PathVariable("id") Long id, @RequestBody Department department) {
        LOGGER.info("Inside updateDepartment of DepartmentController");
        departmentService.updateDepartment(id, department);
        return "Department was updated.";
    }

}
