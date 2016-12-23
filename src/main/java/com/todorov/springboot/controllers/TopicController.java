package com.todorov.springboot.controllers;

import com.todorov.springboot.model.Topic;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * Created by atodorov on 12/23/2016.
 */
@RestController
public class TopicController {

    @RequestMapping("/topics")
    public String getAllTopics(){
        return "All topics";
    }


    @RequestMapping("/topicsList")
    public List<Topic> getAllTopicsList(){
        return Arrays.asList(
                new Topic("spring", "Spring Framework", "Spring Framework Description"),
                new Topic("java", "Core Java", "Core Java Description"),
                new Topic("javascript", "JavaScript", "JavaScript Description")
        );
    }
}
