package com.company.springvalidation.advice;

import com.company.springvalidation.exception.UserNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class AppExceptionHandler {
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String> handlerInvalidArgument(MethodArgumentNotValidException ex) {
        Map<String, String> errorMap = new HashMap<>();
        ex.getBindingResult().getFieldErrors().forEach(fieldError -> {
            errorMap.put(fieldError.getField(), fieldError.getDefaultMessage());
        });
        return errorMap;
    }

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(UserNotFoundException.class)
    public Map<String, String> handlerBusinessException(UserNotFoundException ex) {
        Map<String, String> errorMap = new HashMap<>();
        errorMap.put("errorMessage", ex.getMessage());
        return errorMap;
    }
}
