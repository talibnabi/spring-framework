package com.company.springthird.controller;

import com.company.springthird.model.Line;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("product")
public class ItemController {

    @GetMapping("item3")
    public Line handleEntity() {
        return new Line("Alisa", 34.45);
    }
}
