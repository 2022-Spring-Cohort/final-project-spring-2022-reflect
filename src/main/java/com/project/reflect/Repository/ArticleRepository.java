package com.project.reflect.Repository;

import com.project.reflect.Model.Article;
import org.springframework.data.repository.CrudRepository;

public interface ArticleRepository extends CrudRepository<Article, Long> {

}
