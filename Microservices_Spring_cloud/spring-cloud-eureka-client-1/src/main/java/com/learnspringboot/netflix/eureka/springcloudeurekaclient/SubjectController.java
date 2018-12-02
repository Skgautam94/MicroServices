package com.learnspringboot.netflix.eureka.springcloudeurekaclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class SubjectController {

    private final Random random = new Random();
    @Value("${words}")
    private String[] words;

    @GetMapping("/")
    public String sub() {
        return words[random.nextInt(words.length)];
    }
}
