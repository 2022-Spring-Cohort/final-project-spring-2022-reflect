package com.project.reflect.Repository;

import com.project.reflect.Model.Topic;
import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, Long> {
    Topic findByName(String name);
}
