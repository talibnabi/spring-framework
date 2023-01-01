package com.company.springthird.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("redirect")
public class RedirectGetController {

    // http://localhost:8099/redirect/1
    @GetMapping("1")
    public String handle1() {
        // FULL URL for external resources
        return "redirect:https://google.com";
    }

    // http://localhost:8099/redirect/2
    @GetMapping("2")
    public String handle2() {
        return "redirect:/product/item3";
    }

    // http://localhost:8099/redirect/3
    @GetMapping("3")
    public RedirectView handle3() {
        return new RedirectView("https://google.com");
    }

    // http://localhost:8099/redirect/4
    @GetMapping("4")
    public RedirectView handle4() {
        return new RedirectView("/product/item3");
    }

}
