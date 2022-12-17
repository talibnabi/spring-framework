package com.company.toyshop.model;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@Builder
public class Student {
    @Id
    private Integer studentID;
    private String studentName;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Student student = (Student) o;
        return studentID != null && Objects.equals(studentID, student.studentID);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
