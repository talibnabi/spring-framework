package com.company.springvalidation.service.concretes;

import com.company.springvalidation.dataAccess.abstracts.UserDao;
import com.company.springvalidation.entity.concretes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserDao userDao;

    @Autowired
    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public User createUser(User user) {
        return userDao.save(user);
    }
}
