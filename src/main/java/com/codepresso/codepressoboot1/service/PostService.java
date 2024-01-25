package com.codepresso.codepressoboot1.service;

import com.codepresso.codepressoboot1.dto.PostDto;
import org.springframework.stereotype.Service;

@Service
public class PostService {
    public PostDto getPost(Integer id) {
        System.out.println("find post data from database by " + id);
        System.out.println("validate data from database"); //디비 데이터 접근
        System.out.println("process data if necessary"); // 데이터 가공

        return new PostDto(id, "title", "this is content", "isha"); // 호출한 메서드로 결과 반환
    }
}
