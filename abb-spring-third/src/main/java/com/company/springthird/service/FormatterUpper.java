package com.company.springthird.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class FormatterUpper implements Formatter {
    @Override
    public String format(String origin) {
        return origin.toUpperCase();
    }
}
