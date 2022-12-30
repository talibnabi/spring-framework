package com.company.springpractice.controller;

import com.company.springpractice.service.CalcService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;


@RestController
@RequiredArgsConstructor
@RequestMapping("calc")
public class CalcController {
    private final CalcService calcService;

    @GetMapping("add")
    public String add(@RequestParam("x") Integer x, @RequestParam("y") Integer y) {
        int result = calcService.add(x, y);
        return String.format("Result: %d", result);
    }

    @GetMapping("integral")
    public String integral(@RequestParam("from") Double from, @RequestParam("to") Double to) {
        Double result = calcService.integral(from, to);
        return String.format("Result: %f", result);
    }
}
