package com.company.springboottutorial.controller;

import com.company.springboottutorial.entity.Department;
import com.company.springboottutorial.error.DepartmentNotFoundException;
import com.company.springboottutorial.service.inter.DepartmentService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@WebMvcTest(DepartmentController.class)
class DepartmentControllerTest {

    @Autowired
    private MockMvc mockMvc;
    @MockBean
    private DepartmentService departmentService;
    private Department department;

    @BeforeEach
    void setUp() {
        department = Department.builder()
                .departmentAddress("Baku")
                .departmentCode("12345")
                .departmentName("Alisa")
                .departmentId(1L)
                .build();
    }

    @Test
    void getDepartment() throws Exception {
        Department inputDepartment = Department.builder()
                .departmentAddress("Baku")
                .departmentCode("12345")
                .departmentName("Alisa")
                .departmentId(1L)
                .build();
        Mockito.when(departmentService.saveDepartment(inputDepartment))
                .thenReturn(Optional.ofNullable(department));
        mockMvc.perform(MockMvcRequestBuilders.post("/save")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{   \"departmentName\":\"Alisa\",\n" +
                                "    \"departmentAddress\":\"Baku\",\n" +
                                "    \"departmentCode\": \"12345\"\n" +
                                "}"))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    void saveDepartment() {
    }
}