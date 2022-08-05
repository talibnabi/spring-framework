package com.company.springvalidation.exception;


public class UserNotFoundException extends Exception {
    public UserNotFoundException(String message) {
        super(message);
    }
}
