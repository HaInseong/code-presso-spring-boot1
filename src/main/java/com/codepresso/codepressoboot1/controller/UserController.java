package com.codepresso.codepressoboot1.controller;

import com.codepresso.codepressoboot1.dto.SpecialtyDto;
import com.codepresso.codepressoboot1.dto.UserDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

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

    @RequestMapping
    public UserDto getUser() {
        List<SpecialtyDto> specialties = new ArrayList<>();
//        specialties.add("Java");
//        specialties.add("Spring Boot");
        specialties.add(new SpecialtyDto("Java", "advanced"));
        specialties.add(new SpecialtyDto("Spring Boot", "Intermediate"));
        //Check through <PostMan>!!
        return new UserDto(1, "jin", "jin@codepresso.kr", specialties);
    }

}
