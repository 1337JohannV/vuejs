package com.vuejs.vuejs.controllers;

import com.vuejs.vuejs.service.FibonacciCalc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
public class CalcController {

    @Autowired
    private FibonacciCalc calc;

    @ResponseBody
    @PostMapping("/calc")
    public String calculate(@RequestBody String n, HttpServletResponse response) {


        response.setContentType("text/plain");
        response.setCharacterEncoding("UTF-8");
        return calc.calculate(n);
    }
}
