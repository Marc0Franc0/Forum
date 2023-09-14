package com.app.Forum.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.Date;

@Getter
@Builder
public class TopicDTO {
    private String title;
    private String message;
    private Date creationDate;
    private Boolean status;
    private String author;
    private String curso;

}
