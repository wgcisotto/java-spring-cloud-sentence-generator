package com.wgcisotto.sentence.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.wgcisotto.sentence.dao.*;
import com.wgcisotto.sentence.domain.Word;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WordServiceImpl implements WordService {


    @Autowired VerbClient verbClient;
    @Autowired SubjectDaoImpl subjectClient;
    @Autowired ArticleDaoImpl articleClient;
    @Autowired AdjectiveDaoImpl adjectiveClient;
    @Autowired NounClient nounClient;

    @Override
    @HystrixCommand(fallbackMethod = "getFallbackSubject")
    public Word getSubject() {
        return subjectClient.getWord();
    }

    @Override
    public Word getVerb() {
        return verbClient.getWord();
    }

    @Override
    public Word getArticle() {
        return articleClient.getWord();
    }

    @Override
    public Word getAdjective() {
        return adjectiveClient.getWord();
    }

    @Override
    public Word getNoun() {
        return nounClient.getWord();
    }

    private Word getFallbackSubject(){
        return  new Word("Anything");
    }
}
