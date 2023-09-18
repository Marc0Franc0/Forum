package com.app.Forum.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import java.time.LocalDate;
import java.util.Date;

@Getter
@Builder
public class TopicDTO {
    private String title;
    private String message;
    //formato para la fecha-> year, month, day (yyyy-MM-dd)
    private String creationDate;
    private boolean status;
    private String author;
    private String curso;

}
