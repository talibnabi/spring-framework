package com.company.springboottutorial.controller;

import com.company.springboottutorial.entity.Department;
import com.company.springboottutorial.service.inter.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/department")
@RequiredArgsConstructor
@CrossOrigin
public class DepartmentController {

    private final DepartmentService departmentService;


    @GetMapping("/getAllDepartment")
    public List<Department> getAllDepartment() {
        return departmentService.getAllDepartment();
    }

    @GetMapping("/getByDepartmentName/name/{name}")
    public Department getByDepartmentName(@PathVariable("name") String departmentName) {
        return departmentService.findDepartmentByDepartmentName(departmentName);
    }

    @GetMapping("/getByDepartmentName/nameIgnoreCase/{name}")
    public Department getByDepartmentNameIgnoreCase(@PathVariable("name") String departmentName) {
        return departmentService.findDepartmentByDepartmentNameIgnoreCase(departmentName);
    }

    @GetMapping("/getDepartment/{id}")
    public Department getDepartment(@PathVariable("id") Long id) {
        return departmentService.getDepartment(id);
    }

    @PostMapping("/save")
    public Department saveDepartment(@Valid @RequestBody Department department) {
        return departmentService.saveDepartment(department);
    }

    @DeleteMapping("/deleteDepartment/{id}")
    public String deleteDepartment(@PathVariable("id") Long id) {
        departmentService.deleteDepartment(id);
        return "Department was deleted.";
    }

    @PutMapping("/updateDepartment/{id}")
    public String updateDepartment(@PathVariable("id") Long id, @RequestBody Department department) {
        departmentService.updateDepartment(id, department);
        return "Department was updated.";
    }

}
