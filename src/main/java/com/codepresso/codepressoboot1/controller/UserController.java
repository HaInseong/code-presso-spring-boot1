package com.codepresso.codepressoboot1.controller;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @RequestMapping(value = "/paid")
    public String getPaidUser() {
        return "I'm a paid user.";
    }

    @RequestMapping(value = "/enterprise")
    public String getEnterpriseUser() {
        return "I'm a enterprise user.";
    }

}
