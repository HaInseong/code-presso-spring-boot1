package com.codepresso.codepressoboot1.controller;

import org.springframework.web.bind.annotation.*;

import static org.springframework.web.bind.annotation.RequestMethod.*;


@RestController
@RequestMapping(value = "/post")
public class PostController {

//    @RequestMapping(method = GET)
    @GetMapping
    public String getPost() {
        return "GET /post";
    }

//    @RequestMapping(method = POST)
    @PostMapping
    public String savePost() {
        return "POST /post";
    }

//    @RequestMapping(method = PUT)
    @PutMapping
    public String updatePost() {
        return "PUT /post";
    }

//    @RequestMapping(method = DELETE)
    @DeleteMapping
    public String deletePost() {
        return "DELETE /post";
    }

}
