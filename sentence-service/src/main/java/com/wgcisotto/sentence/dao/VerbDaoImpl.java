package com.wgcisotto.sentence.dao;

import org.springframework.stereotype.Component;

@Component("verbService")
public class VerbDaoImpl extends WordDaoImpl {
    @Override
    public String partOfSpeech() {
        return VERB;
    }
}
