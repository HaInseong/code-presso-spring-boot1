package com.codepresso.codepressoboot1.controller;

import com.codepresso.codepressoboot1.dto.PostDto;
import com.codepresso.codepressoboot1.service.PostService;
import org.springframework.web.bind.annotation.*;

import static org.springframework.web.bind.annotation.RequestMethod.*;


@RestController
@RequestMapping(value = "/post")
public class PostController {
//    PostService postService = new PostService();
    PostService postService; //new 키워드로 객체를 직접 생성하지 않고 의존성 주입
    public PostController (PostService postService) {
        this.postService = postService;
    }

//    @RequestMapping(method = GET\
    @GetMapping
    public PostDto getPost(@RequestParam Integer id) { //컨트롤러는 요청을 받고
        PostDto result = postService.getPost(id); //요청에 대한 처리를 서비스에게 위임
        return result; //처리된 결과를 받아서 클라이언트에게 최종 결과를 보여줌
        //즉, 컨트롤러는 요청을 받고 응답하는 역할만 함.
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
