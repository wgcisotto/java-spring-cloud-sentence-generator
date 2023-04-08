package com.wgcisotto.sentence.dao;

import org.springframework.stereotype.Component;

@Component("nounService")
public class NounDaoImpl extends WordDaoImpl {
    @Override
    public String partOfSpeech() {
        return NOUN;
    }
}
