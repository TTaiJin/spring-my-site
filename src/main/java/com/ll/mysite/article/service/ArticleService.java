package com.ll.mysite.article.service;

import com.ll.mysite.article.controller.Article;
import com.ll.mysite.article.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ArticleService {

    private final ArticleRepository articleRepository;

    public void create(String subject, String content) {
        Article article = new Article();
        article.setSubject(subject);
        article.setContent(content);
        this.articleRepository.save(article);
    }
}
