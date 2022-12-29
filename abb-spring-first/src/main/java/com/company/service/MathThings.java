package com.company.service;

import org.springframework.cglib.core.internal.Function;
import org.springframework.stereotype.Component;

@Component
public class MathThings {
    public double integral(double from, double to, Function<Double, Double> function) {
        return function.apply(from);
    }
}
