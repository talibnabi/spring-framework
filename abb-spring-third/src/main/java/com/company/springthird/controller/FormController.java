package com.company.springthird.controller;

import com.company.springthird.model.FormLogin;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "fm")
public class FormController {

    @GetMapping("show")
    public String formShow() {
        return "form1";
    }

    @PostMapping("process")
    @ResponseBody
    public String formProcess(FormLogin formLogin) {
        System.out.println("yes");
        return String.format("Got the form %s", formLogin);
    }
}
