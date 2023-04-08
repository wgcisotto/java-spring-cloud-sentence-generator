package com.wgcisotto.sentence.dao;

import com.wgcisotto.sentence.domain.Word;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("VERB")
public interface VerbClient {

    @GetMapping("/")
    Word getWord();

}
