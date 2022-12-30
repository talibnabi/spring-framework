package com.company.springpractice.controller;

import com.company.springpractice.model.Car;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

@RestController
@RequestMapping(value = "car", method = {RequestMethod.GET, RequestMethod.POST})
public class CarController {

    @GetMapping("get")
    public String get(@RequestParam("integers") Integer... integers) {
        return String.format("Result: %d", Arrays.stream(integers).count());
    }

    @PostMapping("add")
    public String add(@RequestBody Car car) {
        Integer[] integers = car.getCount();
        System.out.println(Arrays.toString(integers));
        return String.format(car.toString());
    }
}
