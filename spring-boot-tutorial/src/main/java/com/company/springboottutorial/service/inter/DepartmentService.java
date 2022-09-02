package com.company.springboottutorial.service.inter;

import com.company.springboottutorial.entity.Department;

import java.util.List;

public interface DepartmentService {
    Department saveDepartment(Department department);

    List<Department> getAllDepartment();

    Department getDepartment(Long id);

    void deleteDepartment(Long id);

    void updateDepartment(Long id, Department department);

    Department findDepartmentByDepartmentName(String departmentName);

    Department findDepartmentByDepartmentNameIgnoreCase(String departmentName);
}
