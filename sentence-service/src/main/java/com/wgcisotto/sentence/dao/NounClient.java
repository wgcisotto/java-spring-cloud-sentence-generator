package com.wgcisotto.sentence.dao;

import com.wgcisotto.sentence.domain.Word;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("NOUN")
public interface NounClient {

    @GetMapping("/")
    Word getWord();
}
