package com.company.springfifth2.controller;


import com.company.springfifth2.model.UserData;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("book")
@SessionAttributes(UserData.keyName) // KEY in attributes Map<String, Object>
public class BookingController {

    @ModelAttribute(UserData.keyName)
    public UserData initialCreation() {
        return UserData.make();
    }

    // http://localhost:8099/book/a
    @GetMapping("a")
    public String a(@ModelAttribute(UserData.keyName) UserData userData, HttpSession session) {
        System.out.println(userData);
        return userData.toString();
    }

    // http://localhost:8099/book/b/lang/AZ
    // http://localhost:8099/book/b/lang/UA
    @GetMapping("b/lang/{lang}")
    public String b(@ModelAttribute(UserData.keyName) UserData userData, @PathVariable String lang, HttpSession session) {
        System.out.println(userData);
        userData.setLanguage(lang);
        System.out.println(userData);
        return String.format("New language '%s' set", lang);
    }

    // http://localhost:8099/book/b/res/1920
    // http://localhost:8099/book/b/res/3840
    @GetMapping("b/res/{res}")
    public String c(@ModelAttribute(UserData.keyName) UserData userData, @PathVariable Integer res, HttpSession session) {
        userData.setScreen(res);
        return String.format("New resolution '%d' set", res);
    }

}
