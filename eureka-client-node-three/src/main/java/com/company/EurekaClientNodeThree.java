package com.company;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
public class EurekaClientNodeThree {

	public static void main(String[] args) {
		new SpringApplicationBuilder(EurekaClientNodeThree.class).web(true).run(args);
	}

}