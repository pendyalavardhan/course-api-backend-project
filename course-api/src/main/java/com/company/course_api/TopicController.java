package com.company.course_api;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

@RestController
public class TopicController {
    //sample data
    List<Topic>topics=new ArrayList<>(
            Arrays.asList(
                    new Topic("101","Html5","Html description"),
                    new Topic("102","CSS","CSS description"),
                    new Topic("103","JAVASCRIPT","JS description"),
                    new Topic("104","DOM","DOM description")
            )
    );
    @RequestMapping("/")
    public String home(){
        return "Welcome to CourseAPI";
    }
    @RequestMapping("/topics")
    public List<Topic>getTopics(){
        return topics;
    }
    @RequestMapping("/topics/{id}")
    public Topic getTopicByID(@PathVariable String id){
        Optional<Topic> foundTopic =topics.stream().filter(topic -> topic.getId().equals(id)).findFirst();
        if(foundTopic.isPresent()) {
            return foundTopic.get();
        }
        else{
            return new Topic("N/A","N/A","N/A");
        }
    }
}
