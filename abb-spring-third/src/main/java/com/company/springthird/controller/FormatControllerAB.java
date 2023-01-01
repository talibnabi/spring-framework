package com.company.springthird.controller;

import com.company.springthird.model.Line;
import com.company.springthird.service.Formatter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("fmt2")
public class FormatControllerAB {
    private final Formatter formatter;

    public FormatControllerAB(@Qualifier("formatterBrackets") Formatter formatter) {
        this.formatter = formatter;
    }

    @GetMapping("{name}")
    public Line handler(@PathVariable String name) {
        name = formatter.format(name);
        return new Line(name, 13.34);
    }
}
