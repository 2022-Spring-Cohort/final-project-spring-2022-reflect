package com.project.reflect.Repository;

import com.project.reflect.Model.Session;
import org.springframework.data.repository.CrudRepository;

public interface SessionRepository  extends CrudRepository  <Session, Long> {
}
