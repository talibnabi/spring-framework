package com.company.springboottutorial.service.inter;

import com.company.springboottutorial.entity.Department;

import java.util.List;

public interface DepartmentService {
    Department saveDepartment(Department department);

    List<Department> getDepartment();

}
