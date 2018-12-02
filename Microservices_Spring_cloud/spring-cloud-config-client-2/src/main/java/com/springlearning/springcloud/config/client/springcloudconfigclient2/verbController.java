package com.springlearning.springcloud.config.client.springcloudconfigclient2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class verbController {
    private final Random random = new Random();

    @Value("${words}")
    private String[] words;

    @GetMapping("/")
    public String getVerb(){
        return words[random.nextInt(words.length)];
    }
}
