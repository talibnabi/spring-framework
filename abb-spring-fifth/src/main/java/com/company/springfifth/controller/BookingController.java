package com.company.springfifth.controller;

import com.company.springfifth.session.CustomerDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/")
@SessionAttributes(
        names = {CustomerDetails.ATTR},
        types = {CustomerDetails.class}
)
public class BookingController {

    @ModelAttribute(CustomerDetails.ATTR)
    public CustomerDetails initial() {
        return new CustomerDetails();
    }

    // http://localhost:8099/booking
    @GetMapping("booking")
    public String booking_get(@ModelAttribute(CustomerDetails.ATTR) CustomerDetails cd) {
        return "1booking";
    }

    @PostMapping("booking")
    public RedirectView booking_post(@ModelAttribute(CustomerDetails.ATTR) CustomerDetails cd) {
        return new RedirectView("customer");
    }

    @GetMapping("customer")
    public String customer_get(@ModelAttribute(CustomerDetails.ATTR) CustomerDetails cd) {
        return "2customer";
    }

    @PostMapping("customer")
    public RedirectView customer_post(@ModelAttribute(CustomerDetails.ATTR) CustomerDetails cd) {
        return new RedirectView("payment");
    }

    @GetMapping("payment")
    public String payment_get(@ModelAttribute(CustomerDetails.ATTR) CustomerDetails cd) {
        return "3payment";
    }

    @PostMapping("payment")
    public RedirectView payment_post(@ModelAttribute(CustomerDetails.ATTR) CustomerDetails cd) {
        return new RedirectView("review");
    }

    @GetMapping("review")
    public String review_get(@ModelAttribute(CustomerDetails.ATTR) CustomerDetails cd) {
        return "4review";
    }

    @PostMapping("review")
    public RedirectView review_post(@ModelAttribute(CustomerDetails.ATTR) CustomerDetails cd) {
        return new RedirectView("confirm");
    }

    @GetMapping("confirm")
    public String confirm_get(@ModelAttribute(CustomerDetails.ATTR) CustomerDetails cd) {
        return "5confirm";
    }

    @PostMapping("confirm")
    @ResponseBody
    public String process(@ModelAttribute(CustomerDetails.ATTR) CustomerDetails cd) {
        // ... whatever you want
        return cd.toString();
    }


}
