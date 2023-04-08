package com.wgcisotto.sentence.dao;

import org.springframework.stereotype.Component;

@Component("subjectService")
public class SubjectDaoImpl extends WordDaoImpl {
    @Override
    public String partOfSpeech() {
        return SUBJECT;
    }
}
