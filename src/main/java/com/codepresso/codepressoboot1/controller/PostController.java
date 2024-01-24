package com.codepresso.codepressoboot1.controller;

import com.codepresso.codepressoboot1.dto.PostDto;
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
    public PostDto savePost(@RequestBody PostDto postDto) {
        System.out.println(postDto.getId());
        System.out.println(postDto.getTitle());
        System.out.println(postDto.getContent());
        System.out.println(postDto.getUsername());
        return new PostDto(1, "테스트", "둘리", "희동이");
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
