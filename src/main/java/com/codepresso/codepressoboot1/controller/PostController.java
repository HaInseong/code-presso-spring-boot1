package com.codepresso.codepressoboot1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.*;


@RestController
@RequestMapping(value = "/post")
public class PostController {

    @RequestMapping(method = GET)
    public String getPost() {
        return "GET /post";
    }

    @RequestMapping(method = POST)
    public String savePost() {
        return "POST /post";
    }

    @RequestMapping(method = PUT)
    public String updatePost() {
        return "PUT /post";
    }

    @RequestMapping(method = DELETE)
    public String deletePost() {
        return "DELETE /post";
    }

}
