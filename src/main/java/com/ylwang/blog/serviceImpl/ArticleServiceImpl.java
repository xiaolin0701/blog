package com.ylwang.blog.serviceImpl;

import com.ylwang.blog.entity.Article;
import com.ylwang.blog.mapper.ArticleMapper;

import java.util.List;

public interface ArticleServiceImpl {

    List<Article> getAllArticles();


    Article getArticleById(Long id);

    void createArticle(Article article);

    void updateArticle(Article article);

    void deleteArticle(Long id);

}
