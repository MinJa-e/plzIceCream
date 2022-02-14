package com.plzIceCream.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class controller {

    @GetMapping
    public String index() {
        return "index";
    }

    @GetMapping("/success")
    public String success() {
        return "views/success";
    }

    @GetMapping("/fail")
    public String fail() {
        return "views/fail";
    }
}
