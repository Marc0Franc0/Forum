package com.app.Forum.controller;

import com.app.Forum.model.Topic;
import com.app.Forum.service.TopicService;
import com.app.Forum.service.crud.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public void create(){

    }
    public void updateById(){

    }
    public void deleteById(){

    }
}
