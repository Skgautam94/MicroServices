package com.springlearning.springcloud.config.client.springcloudconfigclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RestController
public class LuckyWordController {

    @Value("${lucky-word}")
    private String luckyWord;

    @PostConstruct
    @GetMapping("/luckyWord")
    public String showLuckyWord() {
        return "The lucky Word is " + luckyWord;
    }
}
