package com.demoact.actdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping("/hi")
    public String sayHi() {
        return "hello world 2020 Jun 10";
    }

}