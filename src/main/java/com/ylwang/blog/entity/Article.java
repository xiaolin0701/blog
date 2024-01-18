package com.ylwang.blog.entity;

import com.baomidou.mybatisplus.annotation.TableName;
@TableName("ArticleList")
public class Article {
    public Long getId() {
        return id;
    }

    private Long id;

    public String getArticle() {
        return article;
    }

    public void setArticleurl(String articleurl) {
        this.article = articleurl;
    }

    private String article;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private String title;
    public void setId(Long id) {
        this.id = id;
    }
}
