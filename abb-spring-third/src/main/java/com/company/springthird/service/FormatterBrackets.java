package com.company.springthird.service;

import org.springframework.stereotype.Service;

@Service
public class FormatterBrackets implements Formatter{
    @Override
    public String format(String origin) {
        return String.format("[%s]", origin);
    }
}
