package com.springlearning.springcloud.config.client.springcloudconfigclient3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class ArticleController {
    private final Random random = new Random();

    @Value("${words}")
    private String[] words;

    @GetMapping("/")
    public String getArticle() {
        return words[random.nextInt(words.length)];
    }
}
