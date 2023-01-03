package com.company.springfifth2.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("booking")
public class StudyingController {

    private final String cookieName = "JID";
    private final String NOT_FOUND = "Cookie not found";

    private Optional<Cookie> find(HttpServletRequest rq) {
        return Optional.ofNullable(rq.getCookies()).flatMap(cc -> Arrays.stream(cc).filter(c -> c.getName().equals(cookieName)).findFirst());
    }


    /** setting cookie */
    // http://localhost:8099/booking/z
    @GetMapping("z")
    public String set(HttpServletResponse rs) {
        rs.addCookie(new Cookie(cookieName, UUID.randomUUID().toString()));
        return "cookie set";
    }

    /** removing cookie */
    // http://localhost:8099/booking/x
    @GetMapping("x")
    public String clear(HttpServletResponse rs) {
        Cookie c = new Cookie(cookieName,"");
        c.setMaxAge(0);
        rs.addCookie(c);
        return "cookie removed";
    }

    /** accessing cookie # 1*/
    // http://localhost:8099/booking/a
    @GetMapping("a")
    public String access1(HttpServletRequest rq) {
        Optional<Cookie> cookie = find(rq);
        return cookie.map(Cookie::getValue).toString();
    }

    
}
