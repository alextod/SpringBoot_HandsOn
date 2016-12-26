package com.todorov.springboot.service;

import com.todorov.springboot.model.Course;
import com.todorov.springboot.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alex on 24.12.2016.
 */
@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getAllCourses(){
        List<Course> courses = new ArrayList<>();
        courseRepository.findAll().forEach(courses::add);
        return courses;
    }
    public Course getCourse(String id){
        //return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
        return courseRepository.findOne(id);
    }

    public void addCourse(Course course) {
        courseRepository.save(course);
    }

    public void updateCourse(Course course, String id){
//        int index = 0;
//        for (Topic t : topics){
//            if(t.getId().equals(id)){
//                topics.set(index, course);
//                return;
//            }
//            index++;
//        }
        courseRepository.save(course);
    }

    public void deleteCourse(String id) {
//        topics.removeIf(t -> t.getId().equals(id));
        courseRepository.delete(id);
    }

    public List<Course> getAllCourses(String topicId) {
        List<Course> courses = new ArrayList<>();
        courseRepository.findByTopicId(topicId).forEach(courses::add);
        return courses;
    }
}
