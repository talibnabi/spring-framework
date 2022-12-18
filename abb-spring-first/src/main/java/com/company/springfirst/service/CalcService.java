package com.company.springfirst.service;

import com.company.springfirst.controller.MathThings;
import org.springframework.stereotype.Service;

@Service
public class CalcService {
    private final MathThings mathThings;

    public CalcService(MathThings mathThings) {
        this.mathThings = mathThings;
    }

    public int add(int x, int y) {
        return x + y;
    }

    public double integral(double x, double y) {
        return mathThings.integral(x, y, (a) -> a + 100);
    }
}
