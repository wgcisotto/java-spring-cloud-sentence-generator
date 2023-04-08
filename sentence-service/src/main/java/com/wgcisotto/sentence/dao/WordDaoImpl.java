package com.wgcisotto.sentence.dao;

import com.wgcisotto.sentence.domain.Word;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.client.RestTemplate;

public abstract class WordDaoImpl implements WordDao{

    @Autowired
    LoadBalancerClient loadBalanced;

    public abstract String partOfSpeech();

    @Override
    public Word getWord() {
        ServiceInstance instance = loadBalanced.choose(partOfSpeech());
        return (new RestTemplate().getForObject(instance.getUri(), Word.class));
    }
}
