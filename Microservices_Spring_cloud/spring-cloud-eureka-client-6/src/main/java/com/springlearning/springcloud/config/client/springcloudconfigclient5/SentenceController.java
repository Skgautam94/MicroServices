package com.springlearning.springcloud.config.client.springcloudconfigclient5;

import com.sun.jndi.toolkit.url.Uri;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.List;

@RestController
public class SentenceController {

    @Autowired
    private DiscoveryClient client;

    @GetMapping("/sentence")
    public String getSentence() {
        return String.format("%s %s %s %s %s.", getWord("PRACTICE-02-SUBJECT"), getWord("PRACTICE-02-VERB"),
                getWord("PRACTICE-02-ARTICLE"), getWord("PRACTICE-02-ADJECTIVE"),getWord("PRACTICE-02-NOUN"));
    }

    public String getWord(String service) {
        List<ServiceInstance> serviceInstances = client.getInstances(service);
        if(serviceInstances != null && serviceInstances.size() > 0) {
            URI uri = serviceInstances.get(0).getUri();
                if(uri != null) {
                    return (new RestTemplate()).getForObject(uri,String.class);
                }
        }
        return null;
    }
}
