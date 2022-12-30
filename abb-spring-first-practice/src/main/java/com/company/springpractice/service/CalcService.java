package com.company.springpractice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CalcService {
    private final MathService mathService;

    public int add(int x, int y) {
        return x + y;
    }

    public Double integral(Double from, Double to) {
        return mathService.integral(from, to, (a) -> a + (from + to));
    }
}
