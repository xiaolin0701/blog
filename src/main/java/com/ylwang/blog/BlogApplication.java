package com.ylwang.blog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static org.springframework.boot.SpringApplication.run;
@MapperScan("com.ylwang.blog.mapper")
@SpringBootApplication
class BlogApplication {
public static void main(String[] args) {
		run(BlogApplication.class, args);
	}

}
