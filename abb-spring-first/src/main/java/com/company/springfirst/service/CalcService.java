package com.company.springfirst.service;

import com.company.springfirst.controller.MathThings;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CalcService {
    private final MathThings mathThings;

    public int add(int x, int y) {
        return x + y;
    }

    public double integral(double x, double y) {
        return mathThings.integral(x, y, (a) -> a + 100);
    }
}
