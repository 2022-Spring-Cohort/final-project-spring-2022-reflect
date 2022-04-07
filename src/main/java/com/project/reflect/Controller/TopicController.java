package com.project.reflect.Controller;

import com.project.reflect.Model.Topic;
import com.project.reflect.Repository.TopicRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
    private TopicRepository topicRepo;

    public TopicController(TopicRepository topicRepo) {
        this.topicRepo = topicRepo;
    }
   @GetMapping("/topics")
   public Iterable<Topic> getTopic() { return topicRepo.findAll(); }

   @GetMapping("/topics/{name}")
   public Topic getTopic(@PathVariable String name){
        return topicRepo.findByName(name);
   }

}
