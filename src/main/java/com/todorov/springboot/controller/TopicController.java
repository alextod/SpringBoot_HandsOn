package com.todorov.springboot.controller;

import com.todorov.springboot.model.Topic;
import com.todorov.springboot.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by atodorov on 12/23/2016.
 */
@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

    @RequestMapping("/topicsString")
    public String getAllTopics(){
        return "All topics";
    }


    @RequestMapping("/topics")
    public List<Topic> getAllTopicsList(){
        return topicService.getAllTopics();
    }

    @RequestMapping("/topics/{id}")
    public Topic getTopic(@PathVariable String id){
        return topicService.getTopic(id);
    }

    @RequestMapping(value = "/topics", method = RequestMethod.POST)
    public void addTopic(@RequestBody Topic topic){
        topicService.addTopic(topic);
    }

    @RequestMapping(value = "/topics/{id}", method = RequestMethod.PUT)
    public void updateTopic(@RequestBody Topic topic, @PathVariable String id){
        topicService.updateTopic(topic, id);
    }

    @RequestMapping(value = "/topics/{id}", method = RequestMethod.DELETE)
    public void deleteTopic(@PathVariable String id){
        topicService.deleteTopic(id);
    }
}
