package com.app.Forum.service.crud;

import com.app.Forum.service.TopicService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CrudServiceConfig {
    @Bean(name="TopicService")
    public TopicService getTopicService(){
        return new TopicService();
    }
}
