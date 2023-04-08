package com.wgcisotto.sentence.dao;

import org.springframework.stereotype.Component;

@Component("adjectiveService")
public class AdjectiveDaoImpl extends WordDaoImpl {

    @Override
    public String partOfSpeech() {
        return ADJECTIVE;
    }
}
