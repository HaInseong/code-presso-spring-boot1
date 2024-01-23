package com.codepresso.codepressoboot1.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.management.ValueExp;
import java.lang.reflect.Type;

@RestController
@RequestMapping(value = "/user")
public class RequestController {
    //내가 작성한 연습 코드
    @RequestMapping(value = "/post1")
    public String querry(@RequestParam(name = "name", required = false, defaultValue = "인성") String name,
                         @RequestParam(name = "id", required = true) String id) {
        return name + "의 아이디는 " + id + "입니다.";
    }
    @RequestMapping(value = "/post2/{name}/{id}")
    public String path(@PathVariable(name = "name") String name,
                       @PathVariable(name = "id") String id) {
        return name + "의 아이디는 " + id + "입니다.";
    }

    // 강사 예제 코드
    @RequestMapping(value = "post")
    public String getPost(@RequestParam(required = false, defaultValue = "it") String category,
                          @RequestParam Integer id) {
        return "you requested " + category + " - " + id + "post";
    }
    @RequestMapping(value = "/{type}/id/{id}")
    public String getUser(@PathVariable(name = "type") String type,
                          @PathVariable Integer id) {
        return "you requested " + type + " - " + id + " user";
    }
}
