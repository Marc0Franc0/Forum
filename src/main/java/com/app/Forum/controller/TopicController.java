package com.app.Forum.controller;

import com.app.Forum.dto.TopicDTO;
import com.app.Forum.model.Topic;
import com.app.Forum.service.crud.CrudService;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//Clase la cual contiene todos los endpoint correspondientes a la entidad Topic
@RequestMapping("/topics")
@RestController
@SecurityRequirement(name="Bearer Authentication")
public class TopicController {
    @Autowired
    @Qualifier("TopicService")
    CrudService topicService;
    @GetMapping("")
    public ResponseEntity<?> getAll(){
    return ResponseEntity.status(HttpStatus.OK).body(topicService.getAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> get(@PathVariable Long id){
    return ResponseEntity.status(HttpStatus.OK).body(topicService.getById(id)) ;
    }
    @PostMapping("")
    public ResponseEntity<?> create(@RequestBody TopicDTO topicDTO){
        return ResponseEntity.status(HttpStatus.OK).body(topicService.create(topicDTO));

    }
    @PutMapping("/{id}")
    public ResponseEntity<?> updateById(@PathVariable Long id, @RequestBody TopicDTO topicDTO){
    return ResponseEntity.status(HttpStatus.OK).body(topicService.updateById(id,topicDTO));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteById(@PathVariable  Long id){
        return ResponseEntity.status(HttpStatus.OK).body(topicService.removeById(id));
    }
}
