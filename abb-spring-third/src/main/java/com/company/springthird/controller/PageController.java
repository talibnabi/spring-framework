package com.company.springthird.controller;

import com.company.springthird.model.Header;
import com.company.springthird.model.Line;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;

@Controller //method return type is a template
public class PageController {

    // http://localhost:8099/page
    @GetMapping("page")
    public String handle_page(Model model) {

        model.addAttribute("header", new Header("Product name", "Product price"));

        model.addAttribute("lines", Arrays.asList(
                new Line("IPhone 5", 100.0),
                new Line("IPhone X", 1000.0),
                new Line("IPhone 13", 1200.0),
                new Line("IPhone 14", 1500.0)
        ));

        return "page01"; // template name
    }

}
