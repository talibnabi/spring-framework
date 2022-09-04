package com.company.springboottutorial.service.impl;

import com.company.springboottutorial.service.inter.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
@RequiredArgsConstructor
class DepartmentServiceImplTest {
    private final DepartmentService departmentService;

    @BeforeEach
    void setUp() {

    }

    @Test
    public void findDepartmentByDepartmentNameTest() {
        
    }
}