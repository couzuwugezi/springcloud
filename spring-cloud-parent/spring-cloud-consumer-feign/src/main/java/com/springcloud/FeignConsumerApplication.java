package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author liqiang
 * <p>
 * @EnableEurekaClient 消费者也作为一个Eureka客户端
 * </p>
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.springcloud")
public class FeignConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignConsumerApplication.class, args);
    }

}

