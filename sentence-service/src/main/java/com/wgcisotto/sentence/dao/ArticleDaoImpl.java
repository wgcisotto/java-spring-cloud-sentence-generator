package com.wgcisotto.sentence.dao;

import org.springframework.stereotype.Component;

@Component("articleService")
public class ArticleDaoImpl extends WordDaoImpl {

    @Override
    public String partOfSpeech() {
        return ARTICLE;
    }
}
