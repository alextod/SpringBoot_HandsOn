package com.todorov.springboot.repository;

import com.todorov.springboot.model.Topic;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Alex on 24.12.2016.
 */
public interface TopicRepository extends CrudRepository<Topic, String>{

}
