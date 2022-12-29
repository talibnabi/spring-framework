package com.company.controller;

import com.company.service.CalcService;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("calc")
@RequiredArgsConstructor
public class CalcController {
    private final CalcService calcService;

    @GetMapping("add")
    public String add(@RequestParam("x") Integer x, @RequestParam("y") Integer y) {
        int result = calcService.add(x, y);
        return String.format("%d", result);
    }

    @GetMapping("integral")
    public String integral(@RequestParam("x") Integer x) {
        double result = calcService.integral(x, 5);
        return String.format("%f",result);
    }
}
