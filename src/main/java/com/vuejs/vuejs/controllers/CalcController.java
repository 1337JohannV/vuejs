package com.vuejs.vuejs.controllers;

import com.vuejs.vuejs.service.FibonacciCalc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class CalcController {

    @Autowired
    private FibonacciCalc calc;

    @ResponseBody
    @PostMapping("/calc")
    public String calculate(@RequestBody String n, HttpServletResponse response, HttpServletRequest req) {


        response.setContentType("text/plain");
        response.setCharacterEncoding("UTF-8");
        if (response.getStatus() == 400) {
            return "redirect:/error/";

        }
        return calc.calculate(n);
    }
}
