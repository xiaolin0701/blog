package com.ylwang.blog.service;
import com.ylwang.blog.entity.Article;
import com.ylwang.blog.mapper.ArticleMapper;
import com.ylwang.blog.serviceImpl.ArticleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ArticleService implements ArticleServiceImpl {

    private final ArticleMapper articleMapper;
    @Autowired
    public ArticleService(ArticleMapper articleMapper){
        this.articleMapper=articleMapper;
    }

    @Override
    public List<Article> getAllArticles() {
        return null;
    }

    @Override
    public Article getArticleById(Long id) {
        return articleMapper.selectById(id);
    }

    @Override
    public void createArticle(Article article) {
        articleMapper.insert(article);
    }


    @Override
    public void updateArticle(Article article) {

        articleMapper.updateById(article);
    }

    @Override
    public void deleteArticle(Long id) {
        articleMapper.deleteById(id);
    }


}

