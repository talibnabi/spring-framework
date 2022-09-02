package com.company.springboottutorial.service.impl;

import com.company.springboottutorial.entity.Department;
import com.company.springboottutorial.repository.DepartmentRepository;
import com.company.springboottutorial.service.inter.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class DepartmentServiceImpl implements DepartmentService {
    private final DepartmentRepository departmentRepository;

    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> getAllDepartment() {
        return departmentRepository.findAll();
    }

    @Override
    public Department getDepartment(Long id) {
        return departmentRepository.findById(id).get();
    }

    @Override
    public void deleteDepartment(Long id) {
        Department department = getDepartment(id);
        departmentRepository.delete(department);
    }

    @Override
    public void updateDepartment(Long id, Department department) {
        Department department1 = getDepartment(id);
        if (department.getDepartmentName() != null && !"".equalsIgnoreCase(department.getDepartmentName())) {
            department1.setDepartmentName(department.getDepartmentName());
        }
        if (department.getDepartmentCode() != null && !"".equalsIgnoreCase(department.getDepartmentCode())) {
            department1.setDepartmentCode(department.getDepartmentCode());
        }
        if (department.getDepartmentAddress() != null && !"".equalsIgnoreCase(department.getDepartmentAddress())) {
            department1.setDepartmentAddress(department.getDepartmentAddress());
        }
        departmentRepository.save(department1);
    }

    @Override
    public Department findDepartmentByDepartmentName(String departmentName) {
        return departmentRepository.findDepartmentByDepartmentName(departmentName);
    }

    public Department findDepartmentByDepartmentNameIgnoreCase(String departmentName) {
        return departmentRepository.findDepartmentByDepartmentNameIgnoreCase(departmentName);
    }

}
