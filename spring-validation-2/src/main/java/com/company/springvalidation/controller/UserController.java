package com.company.springvalidation.controller;

import com.company.springvalidation.dto.UserRequest;
import com.company.springvalidation.entity.User;
import com.company.springvalidation.exception.UserNotFoundException;
import com.company.springvalidation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/signUp")
    public ResponseEntity<User> saveUser(@Valid @RequestBody UserRequest userRequest) {
        return new ResponseEntity<User>(userService.saveUser(userRequest), HttpStatus.CREATED);
    }

    @GetMapping("/allUsers")
    public ResponseEntity<List<User>> getAllUser() {
        return ResponseEntity.ok(userService.getAllUser());
    }

    @GetMapping("/user")
    public ResponseEntity<User> getUser(@RequestParam int id) throws UserNotFoundException {
        return ResponseEntity.ok(userService.getUser(id));
    }
}
