package com.springlearning.springcloud.config.client.springcloudconfigclient5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudConfigClient5Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigClient5Application.class, args);
	}
}
