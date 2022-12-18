package com.company.springfirst.controller;

import com.company.springfirst.service.CalcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("calc")
public class CalcController {
    private final CalcService calcService;

    public CalcController(CalcService calcService) {
        this.calcService = calcService;
    }

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
