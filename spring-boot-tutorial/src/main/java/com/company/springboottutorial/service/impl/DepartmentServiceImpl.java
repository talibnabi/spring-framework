package com.company.springboottutorial.service.impl;

import com.company.springboottutorial.entity.Department;
import com.company.springboottutorial.error.DepartmentNotFoundException;
import com.company.springboottutorial.repository.DepartmentRepository;
import com.company.springboottutorial.service.inter.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static com.company.springboottutorial.utils.ExceptionUtil.DEPARTMENT_NOT_FOUND;

@RequiredArgsConstructor
@Service
public class DepartmentServiceImpl implements DepartmentService {
    private final DepartmentRepository departmentRepository;

    @Override
    public Optional<Department> saveDepartment(Department department) throws DepartmentNotFoundException {
        return Optional.of(Optional.of(departmentRepository.save(department)).orElseThrow(() ->
                new DepartmentNotFoundException(DEPARTMENT_NOT_FOUND)));
    }

    @Override
    public Optional<List<Department>> getAllDepartment() throws DepartmentNotFoundException {
        return Optional.of(Optional.of(departmentRepository.findAll()).orElseThrow(() ->
                new DepartmentNotFoundException(DEPARTMENT_NOT_FOUND)));
    }

    @Override
    public Optional<Department> getDepartment(Long id) throws DepartmentNotFoundException {
        Optional<Department> department = departmentRepository.findById(id);
        if (department.isEmpty()) {
            throw new DepartmentNotFoundException(DEPARTMENT_NOT_FOUND);
        }
        return department;
    }

    @Override
    public void deleteDepartment(Long id) throws DepartmentNotFoundException {
        Optional<Department> department = Optional.of(getDepartment(id).orElseThrow(() ->
                new DepartmentNotFoundException(DEPARTMENT_NOT_FOUND)));
        department.ifPresent(departmentRepository::delete);
    }

    @Override
    public void updateDepartment(Long id, Department department) throws DepartmentNotFoundException {
        Optional<Department> department1 = Optional.ofNullable(getDepartment(id).orElseThrow(() ->
                new DepartmentNotFoundException(DEPARTMENT_NOT_FOUND)));
        if (department.getDepartmentName() != null && !"".equalsIgnoreCase(department.getDepartmentName())) {
            department1.ifPresent(department2 -> department2.setDepartmentName(department.getDepartmentName()));
        }
        if (department.getDepartmentCode() != null && !"".equalsIgnoreCase(department.getDepartmentCode())) {
            department1.ifPresent(department2 -> department2.setDepartmentCode(department.getDepartmentCode()));
        }
        if (department.getDepartmentAddress() != null && !"".equalsIgnoreCase(department.getDepartmentAddress())) {
            department1.ifPresent(department2 -> department2.setDepartmentAddress(department.getDepartmentAddress()));
        }
        department1.ifPresent(departmentRepository::save);
    }

    @Override
    public Optional<Department> findDepartmentByDepartmentName(String departmentName) throws DepartmentNotFoundException {
        return Optional.of(Optional.ofNullable(departmentRepository.findDepartmentByDepartmentName(departmentName)).orElseThrow(() ->
                new DepartmentNotFoundException(DEPARTMENT_NOT_FOUND)));
    }

    public Optional<Department> findDepartmentByDepartmentNameIgnoreCase(String departmentName) throws DepartmentNotFoundException {
        return Optional.of(Optional.ofNullable(departmentRepository.findDepartmentByDepartmentNameIgnoreCase(departmentName)).orElseThrow(() ->
                new DepartmentNotFoundException(DEPARTMENT_NOT_FOUND)));
    }



}
