package com.todorov.springboot.repository;

import com.todorov.springboot.model.Course;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Alex on 24.12.2016.
 */
public interface CourseRepository extends CrudRepository<Course,String> {
    List<Course> findByTopicId(String topicId);
}
