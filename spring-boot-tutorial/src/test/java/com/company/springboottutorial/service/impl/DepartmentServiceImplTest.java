package com.company.springboottutorial.service.impl;

import com.company.springboottutorial.entity.Department;
import com.company.springboottutorial.error.DepartmentNotFoundException;
import com.company.springboottutorial.repository.DepartmentRepository;
import com.company.springboottutorial.service.inter.DepartmentService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
class DepartmentServiceImplTest {
    @Autowired
    private DepartmentService departmentService;

    @MockBean
    private DepartmentRepository departmentRepository;

    @BeforeEach
    void setUp() {
        Department department = Department.builder()
                .departmentName("Azersun")
                .departmentAddress("Sabuncu")
                .departmentCode("4344")
                .departmentId(1L)
                .build();
        Mockito.when(departmentRepository.findAll()).thenReturn(List.of(department));
    }

    @Test
    public void findDepartmentByDepartmentNameTest() throws DepartmentNotFoundException {
        String departmentName = "Azersun";
        Optional<Department> found = departmentService.findDepartmentByDepartmentName(departmentName);
        assertEquals(departmentName, found.orElseThrow().getDepartmentName());
    }

    @Test
    public void findDepartmentByDepartmentNameIgnoreCaseTest() throws DepartmentNotFoundException {
        String departmentName = "Azersun";
        Optional<Department> found = departmentService.findDepartmentByDepartmentNameIgnoreCase(departmentName);
        assertEquals(departmentName, found.orElseThrow().getDepartmentName());
    }

    @Test
    public void getAllDepartment() throws DepartmentNotFoundException {
        Department department = Department.builder()
                .departmentName("Azersun")
                .departmentAddress("Sabuncu")
                .departmentCode("4344")
                .departmentId(1L)
                .build();
        List<Department> departments1 = List.of(
                department
        );
        Optional<List<Department>> departments = departmentService.getAllDepartment();
        assertEquals(departments1, departments.orElseThrow());
    }
}