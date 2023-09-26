package com.app.Forum.service.crud;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//Interface la cual es implementada en los service de cada entidad con los método crud básicos
@Component
public interface CrudService {
    public List getAll();
    public Object getById(Long id);
    public Object create(Object object);
    public Object updateById(Long id, Object object);
    public Object removeById (Long id);
 }
