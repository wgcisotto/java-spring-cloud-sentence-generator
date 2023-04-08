package com.wgcisotto.sentence.service;

import com.wgcisotto.sentence.domain.Word;

public interface WordService {

    Word getSubject();
    Word getVerb();
    Word getArticle();
    Word getAdjective();
    Word getNoun();

}
