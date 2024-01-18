package com.ylwang.blog.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ylwang.blog.entity.Article;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ArticleMapper extends BaseMapper<Article> {

}
