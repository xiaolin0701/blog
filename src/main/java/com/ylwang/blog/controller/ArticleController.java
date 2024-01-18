package com.ylwang.blog.controller;

import com.ylwang.blog.entity.Article;
import com.ylwang.blog.service.ArticleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/articles")
public class ArticleController {
    private final ArticleService articleService;

    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }
    @GetMapping
    public List<Article> getAllArticles() {
        return articleService.getAllArticles();
    }
    //查询文章
    @GetMapping("/{id}")
    public Article getArticleById(@PathVariable Long id) {
        return articleService.getArticleById(id);
    }

    //更新文章
    @PutMapping("/{id}")
    public void updateArticle(@PathVariable Long id, @RequestBody Article article) {
        article.setId(id);
        articleService.updateArticle(article);
    }
    //创建文章
    @PostMapping
    public void createArticle(@RequestBody Article article) {
        articleService.createArticle(article);
    }
    @DeleteMapping("/{id}")
    public void deleteArticle(@PathVariable Long id) {
        articleService.deleteArticle(id);
    }
}

