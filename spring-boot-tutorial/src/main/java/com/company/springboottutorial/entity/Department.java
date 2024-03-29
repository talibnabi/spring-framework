package com.company.springboottutorial.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(
        name = "tbl_department",
        uniqueConstraints = {
                @UniqueConstraint(
                        name = "department_code_constraint",
                        columnNames = "department_code"
                ),
                @UniqueConstraint(
                        name = "department_name_constraint",
                        columnNames = "department_name"
                )
        }
)
public class Department {
    @SequenceGenerator(
            name = "department_sequence",
            sequenceName = "department_sequence",
            allocationSize = 1
    )
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "department_sequence"
    )
    @Column(name = "department_id")
    private Long departmentId;

    @NotBlank(message = "Please add department name")
    @Length(max = 10, min = 1,message = "Please add department name")
    @Size(max = 10, min = 1,message = "Please add department name")
    @Column(name = "department_name", nullable = false)
    private String departmentName;

    @Column(name = "department_address", nullable = false)
    private String departmentAddress;

    @Column(name = "department_code", nullable = false)
    private String departmentCode;
}
