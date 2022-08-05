package com.company.springvalidation.dataAccess.abstracts;

import com.company.springvalidation.entity.concretes.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserDao extends JpaRepository<User, Integer> {
}
