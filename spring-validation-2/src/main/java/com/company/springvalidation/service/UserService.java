package com.company.springvalidation.service;

import com.company.springvalidation.dto.UserRequest;
import com.company.springvalidation.entity.User;
import com.company.springvalidation.exception.UserNotFoundException;
import com.company.springvalidation.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private UserRepo userRepo;

    @Autowired
    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public User saveUser(UserRequest userRequest) {
        User user = User
                .build(null, userRequest.getName(), userRequest.getEmail(), userRequest.getPassword(), userRequest.getMobile(), userRequest.getGender(), userRequest.getAge(), userRequest.getNationality());
        return userRepo.save(user);
    }

    public List<User> getAllUser(){
        return userRepo.findAll();
    }

    public User getUser(int id) throws UserNotFoundException {
        User user = userRepo.findByUserId(id);
        if (user != null) {
            return userRepo.findByUserId(id);
        } else {
            throw new UserNotFoundException("User not found with id: " + id);
        }
    }
}
