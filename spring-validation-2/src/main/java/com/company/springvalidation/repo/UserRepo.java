package com.company.springvalidation.repo;

import com.company.springvalidation.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {

    User findByUserId(int id);
}
