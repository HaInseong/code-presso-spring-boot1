package com.codepresso.codepressoboot1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping(value = "/") //Application을 톰캣 서버 위에 띄워둔 후에 할당 받은 서버에 get요청 들어오면 hello 메서드 호출되는 원리.
    public String hello() {
        return "<h1>Hello Spring Boot!!</h1>";
    }
}
