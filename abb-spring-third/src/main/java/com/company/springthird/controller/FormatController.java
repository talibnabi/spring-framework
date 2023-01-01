package com.company.springthird.controller;


import com.company.springthird.model.Line;
import com.company.springthird.service.Formatter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("fmt")
public class FormatController {


    //private final FormatterUpper f;
    private final Formatter formatter;

    @GetMapping("{name}")
    public Line handler(@PathVariable String name) {
        name = formatter.format(name);
        return new Line(name, 23.34);
    }
}
