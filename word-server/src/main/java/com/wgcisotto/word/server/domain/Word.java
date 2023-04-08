package com.wgcisotto.word.server.domain;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Word {

    public String word;

    public Word() {
        super();
    }

    public Word(String word) {
        this();
        this.word = word;
    }

    public String getString() {
        return getWord();
    }

}
