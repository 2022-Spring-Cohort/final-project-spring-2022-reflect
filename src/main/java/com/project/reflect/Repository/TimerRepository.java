package com.project.reflect.Repository;

import com.project.reflect.Model.Timer;
import org.springframework.data.repository.CrudRepository;

public interface TimerRepository extends CrudRepository<Timer, Long> {
}
