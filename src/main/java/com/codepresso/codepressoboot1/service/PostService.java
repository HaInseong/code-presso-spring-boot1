package com.codepresso.codepressoboot1.service;

import com.codepresso.codepressoboot1.dto.PostDto;
import org.springframework.stereotype.Service;

//@Service
//@Service 어노테이션 대신 Configure 어노테이션으로 객체 주입하는 방법 사용
//클래스 상단에 @Controller, @RestController, @Service 등을 붙이면 해당 클래스는 스프링 프레임워크가 직접 객체로 생성한다.
public class PostService {

    public PostDto getPost(Integer id) {
        System.out.println("find post data from database by " + id);
        System.out.println("validate data from database"); //디비 데이터 접근
        System.out.println("process data if necessary"); // 데이터 가공

        return new PostDto(id, "title", "this is content", "isha"); // 호출한 메서드로 결과 반환
    }
}
