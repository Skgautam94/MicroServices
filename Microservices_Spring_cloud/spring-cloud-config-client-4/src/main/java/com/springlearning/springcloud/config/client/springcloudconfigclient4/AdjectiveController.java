package com.springlearning.springcloud.config.client.springcloudconfigclient4;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class AdjectiveController {
    private final Random random = new Random();

    @Value("${words}")
    private String[] words;

    @GetMapping("/")
    public String getAdjective() {
        return words[random.nextInt(words.length)];
    }
}
