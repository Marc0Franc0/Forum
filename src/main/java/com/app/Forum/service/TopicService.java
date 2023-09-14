package com.app.Forum.service;

import com.app.Forum.dto.TopicDTO;
import com.app.Forum.model.Topic;
import com.app.Forum.repository.TopicRepository;
import com.app.Forum.service.crud.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//Clase la cual implmenta la lógica para su utilización en el controller ,
// esta implementa la interface CrudService
@Service
public class TopicService implements CrudService {
    @Autowired
    TopicRepository topicRepository;
    @Override
    public List getAll() {
        //Se obtiene la lista de todos los topicos
        List<Topic>topics = topicRepository.findAll();
        List<TopicDTO> topicsDTO = new ArrayList<>();
        //Solo se obtienen para el valor de retorno todos las propiedades
        //de cada topico menos el id
        for(int i=0; i<topics.size();i++){
            //Se obtiene un topico
            Topic topic= topics.get(i);
            //Se filtran los datos del topico obtenido y se agregan a la lista
            //la cual se retornara
            topicsDTO.add(
                    TopicDTO.builder()
                            .title(topic.getTitle())
                            .curso(topic.getCurso())
                            .author(topic.getAuthor())
                            .creationDate(topic.getCreationDate())
                            .message(topic.getMessage())
                            .status(topic.getStatus())
                            .build());
        }
        return topicsDTO;
    }

    @Override
    public Optional getById(Long id) {
        return Optional.empty();
    }

    @Override
    public Object create(Object object) {
        return null;
    }

    @Override
    public Optional updateById(Long id, Object object) {
        return Optional.empty();
    }

    @Override
    public void removeById(Long id) {

    }
}
