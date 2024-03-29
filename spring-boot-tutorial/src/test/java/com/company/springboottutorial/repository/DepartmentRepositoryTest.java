package com.company.springboottutorial.repository;


import com.company.springboottutorial.entity.Department;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import static org.junit.jupiter.api.Assertions.assertEquals;


@DataJpaTest
class DepartmentRepositoryTest {
    @Autowired
    private DepartmentRepository departmentRepository;
    @Autowired
    private TestEntityManager entityManager;

    @BeforeEach
    void setUp() {
        Department department = Department.builder()
                .departmentName("Mechanical engineering")
                .departmentCode("me-7")
                .departmentAddress("Baku")
                .build();
        entityManager.persist(department);
    }

    @Test
    public void whenFindByIdThenReturnDepartment() {
        Department department=departmentRepository.findById(1L).get();
        assertEquals(department.getDepartmentName(),"Mechanical engineering");
    }

}
