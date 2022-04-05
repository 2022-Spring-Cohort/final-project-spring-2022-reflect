package com.project.reflect.Controller;

import com.project.reflect.Model.Article;
import com.project.reflect.Repository.ArticleRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArticleController {
    private ArticleRepository articleRepo;

    public ArticleController(ArticleRepository articleRepo){
        this.articleRepo = articleRepo;
    }

    @GetMapping("/articles")
    public Iterable<Article> getArticles() {
        return articleRepo.findAll();
    }

    @GetMapping("/articles/{id}")
    public Article getArticle(@PathVariable long id){
        return articleRepo.findById(id).get();
    }
}
