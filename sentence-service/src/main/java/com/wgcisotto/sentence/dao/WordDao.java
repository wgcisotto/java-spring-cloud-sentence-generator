package com.wgcisotto.sentence.dao;

import com.wgcisotto.sentence.domain.Word;

public interface WordDao {

    String SUBJECT = "SUBJECT";
    String VERB = "VERB";
    String ARTICLE = "ARTICLE";
    String ADJECTIVE = "ADJECTIVE";
    String NOUN = "NOUN";

    Word getWord();

}
