package com.codepresso.codepressoboot1.controller;

import com.codepresso.codepressoboot1.dto.SpecialtyDto;
import com.codepresso.codepressoboot1.dto.UserDto;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @RequestMapping(value = "/user/paid")
    public String getPaidUser() {
        return "I'm a paid user.";
    }

    @RequestMapping(value = "/user/enterprise")
    public String getEnterpriseUser() {
        return "I'm a enterprise user.";
    }

    @RequestMapping(value = "/user")
    public UserDto getUser() {
        List<SpecialtyDto> specialties = new ArrayList<>();
//        specialties.add("Java");
//        specialties.add("Spring Boot");
        specialties.add(new SpecialtyDto("Java", "advanced"));
        specialties.add(new SpecialtyDto("Spring Boot", "Intermediate"));
        return new UserDto(1, "jin", "jin@codepresso.kr", specialties);
    }

}
