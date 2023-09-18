package com.app.Forum.controller;

import com.app.Forum.dto.TopicDTO;
import com.app.Forum.model.Topic;
import com.app.Forum.service.TopicService;
import com.app.Forum.service.crud.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//Clase la cual contiene todos los endpoint correspondientes a la entidad Topic
@RequestMapping("/topics")
@RestController
public class TopicController {
    @Autowired
    @Qualifier("TopicService")
    CrudService topicService;
    @GetMapping("")
    public ResponseEntity<?> getAll(){
    return ResponseEntity.status(HttpStatus.OK).body(topicService.getAll());
    }
    public void get(){

    }
    @PostMapping("")
    public Topic create(@RequestBody TopicDTO topicDTO){
        return (Topic) topicService.create(topicDTO);
    }
    public void updateById(){

    }
    public void deleteById(){

    }
}
