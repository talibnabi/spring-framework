package com.company.springboottutorial.service.impl;

import com.company.springboottutorial.entity.Department;
import com.company.springboottutorial.error.DepartmentNotFoundException;
import com.company.springboottutorial.repository.DepartmentRepository;
import com.company.springboottutorial.service.inter.DepartmentService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.*;


@SpringBootTest
@ExtendWith(MockitoExtension.class)
class DepartmentServiceImplTest {
    @Autowired
    private DepartmentService departmentService;

    @MockBean
    private DepartmentRepository departmentRepository;

    @BeforeEach
    void setUp() {
        Department department = Department.builder()
                .departmentName("Milan")
                .departmentAddress("Imishli")
                .departmentCode("4114")
                .departmentId(12L)
                .build();
        Mockito.when(departmentRepository.findById(12L)).thenReturn(Optional.ofNullable(department));
    }

    @Test
    @DisplayName("findDepartmentByDepartmentNameTest")
    public void findDepartmentByDepartmentNameTest() throws DepartmentNotFoundException {
        String departmentName = "Azersun";
        Optional<Department> found = departmentService.findDepartmentByDepartmentName(departmentName);
        assertEquals(departmentName, found.orElseThrow().getDepartmentName());
    }

    @Test
    @DisplayName("findDepartmentByDepartmentNameIgnoreCaseTest")
    public void findDepartmentByDepartmentNameIgnoreCaseTest() throws DepartmentNotFoundException {
        String departmentName = "Azersun";
        Optional<Department> found = departmentService.findDepartmentByDepartmentNameIgnoreCase(departmentName);
        assertEquals(departmentName, found.orElseThrow().getDepartmentName());
    }

    @Test
    @DisplayName("getAllDepartmentTest")
    public void getAllDepartmentTest() throws DepartmentNotFoundException {
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

    @Test
    @DisplayName("getDepartmentTest")
    @Disabled
    public void getDepartmentTest() throws DepartmentNotFoundException {
        Long departmentId = 1L;
        Optional<Department> department = departmentService.getDepartment(departmentId);
        assertEquals(departmentId, department.orElseThrow().getDepartmentId());
    }

    @Test
    @DisplayName("saveDepartmentTest")
    public void saveDepartmentTest() throws DepartmentNotFoundException {
        Department department = Department.builder()
                .departmentName("Azersun")
                .departmentAddress("Sabuncu")
                .departmentCode("4344")
                .departmentId(1L)
                .build();
        Optional<Department> department1 = departmentService.saveDepartment(department);
        assertEquals(department, department1.orElseThrow());
    }

    @Test
    @DisplayName("deleteDepartmentTest")
    public void deleteDepartmentTest() throws DepartmentNotFoundException {
        Department department = Department.builder()
                .departmentName("Azersun")
                .departmentAddress("Sabuncu")
                .departmentCode("4344")
                .departmentId(1L)
                .build();
        doNothing().doThrow(new IllegalStateException())
                .when(this.departmentRepository).deleteById(department.getDepartmentId());
        this.departmentRepository.deleteById(department.getDepartmentId());
        verify(this.departmentRepository).deleteById(department.getDepartmentId());
    }

    @Test
    @DisplayName("updateDepartmentTest")
    public void updateDepartmentTest() throws DepartmentNotFoundException {

        final  Department department = Department.builder()
                .departmentName("Milan")
                .departmentAddress("Imishli")
                .departmentCode("4114")
                .departmentId(12L)
                .build();
        given(departmentRepository.save(department)).willReturn(department);
        departmentService.updateDepartment(department.getDepartmentId(), department);
        verify(departmentRepository).save(any(Department.class));
    }

}