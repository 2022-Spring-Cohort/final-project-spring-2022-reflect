package com.project.reflect.Repository;

import com.project.reflect.Model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
