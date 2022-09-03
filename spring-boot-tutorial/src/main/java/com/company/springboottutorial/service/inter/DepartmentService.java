package com.company.springboottutorial.service.inter;

import com.company.springboottutorial.entity.Department;
import com.company.springboottutorial.error.DepartmentNotFoundException;

import java.util.List;
import java.util.Optional;

public interface DepartmentService {
    Optional<Department> saveDepartment(Department department) throws DepartmentNotFoundException;

    Optional<List<Department>> getAllDepartment();

    Optional<Department> getDepartment(Long id) throws DepartmentNotFoundException;

    void deleteDepartment(Long id) throws DepartmentNotFoundException;

    void updateDepartment(Long id, Department department) throws DepartmentNotFoundException;

    Optional<Department> findDepartmentByDepartmentName(String departmentName) throws DepartmentNotFoundException;

    Optional<Department> findDepartmentByDepartmentNameIgnoreCase(String departmentName) throws DepartmentNotFoundException;
}
