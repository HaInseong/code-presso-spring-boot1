package com.codepresso.codepressoboot1.config;

import com.codepresso.codepressoboot1.service.PostService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public PostService postService() {
        return new PostService();
    }
}
