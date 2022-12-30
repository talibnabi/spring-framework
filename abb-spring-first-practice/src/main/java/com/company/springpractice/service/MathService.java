package com.company.springpractice.service;


import org.springframework.cglib.core.internal.Function;
import org.springframework.stereotype.Component;

@Component
public class MathService {
    public Double integral(Double from, Double to, Function<Double, Double> function) {
        return function.apply(from);
    }
}
