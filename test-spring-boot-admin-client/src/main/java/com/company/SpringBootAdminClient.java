package com.company;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by Administrator on 2016/11/30.
 */
@SpringBootApplication
/**
 * @EnableDiscoveryClient 注解:
 * 该注解能激活Eureka中的DiscoveryClient实现，才能实现Controller中对服务信息的输出。
 * Eureka提供了Application Service 客户端的自行注册功能。
 * Eureka作为客户端
 */
@EnableDiscoveryClient
public class SpringBootAdminClient {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootAdminClient.class, args);
    }

}
