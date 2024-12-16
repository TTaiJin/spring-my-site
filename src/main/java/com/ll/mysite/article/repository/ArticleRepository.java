package com.ll.mysite.article.repository;

import com.ll.mysite.article.controller.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {

}
