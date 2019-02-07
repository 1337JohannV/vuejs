package com.vuejs.vuejs.controllers;


import org.springframework.web.bind.annotation.RequestMapping;


@org.springframework.stereotype.Controller
public class Controller {

    @RequestMapping("/")
    public String hello() {
        return "home";
    }

    @RequestMapping("/error")
    public String error() {
        return "err";
    }
}
