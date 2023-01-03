package com.company.springfifth2.controller;


import com.company.springfifth2.model.UserData;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
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


    /**
     * setting cookie
     */
    // http://localhost:8099/booking/z
    @GetMapping("z")
    public String set(HttpServletResponse rs) {
        rs.addCookie(new Cookie(cookieName, UUID.randomUUID().toString()));
        return "cookie set";
    }

    /**
     * removing cookie
     */
    // http://localhost:8099/booking/x
    @GetMapping("x")
    public String clear(HttpServletResponse rs) {
        Cookie c = new Cookie(cookieName, "");
        c.setMaxAge(0);
        rs.addCookie(c);
        return "cookie removed";
    }

    /**
     * accessing cookie # 1
     */
    // http://localhost:8099/booking/a
    @GetMapping("a")
    public String access1(HttpServletRequest rq) {
        Optional<Cookie> cookie = find(rq);
        return cookie.map(Cookie::getValue).toString();
    }

    /**
     * accessing cookie # 2
     */
    // http://localhost:8099/booking/b
    @GetMapping("b")
    public String access2(@CookieValue(cookieName) Optional<Cookie> cookie) {
        return cookie.map(Cookie::getValue).toString();
    }

    /**
     * introducing the session #1
     */
    // http://localhost:8099/booking/c
    @GetMapping("c")
    public String session1(HttpServletRequest req) {
        HttpSession session = req.getSession();
        String id = session.getId();
        return id;
    }

    /**
     * invalidate session
     */
    // http://localhost:8099/booking/e
    @GetMapping("e")
    public String session3(HttpSession session) {
        session.invalidate();
        return "invalidated";
    }

    /**
     * setting attribute
     */
    // http://localhost:8099/booking/f/en
    // http://localhost:8099/booking/f/az
    @GetMapping("f/{lang}")
    public String session4(HttpSession session, @PathVariable String lang) {
        session.setAttribute("language", lang);
        session.setAttribute("data", new UserData(lang, (int) (Math.random() * 1000)));
        return String.format("user %s language %s set", session.getId(), lang);
    }

    /**
     * setting attribute
     */
    // http://localhost:8099/booking/g
    @GetMapping("g")
    public String session5(HttpSession session) {
        String value = (String) session.getAttribute("language");
        UserData data = (UserData) session.getAttribute("data");
        return String.format("user %s language %s got: %s", session.getId(), value, data);
    }

}
