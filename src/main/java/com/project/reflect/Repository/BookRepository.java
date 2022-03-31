package com.project.reflect.Repository;


import com.project.reflect.Model.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface BookRepository extends CrudRepository<Book, Long> {
    Optional<Book> findByIgnoreCase(String name);
}
