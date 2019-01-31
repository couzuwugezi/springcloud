package com.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author liqiang
 * <p>
 *      @EnableEurekaClient 说明这个是Eureka服务提供者
 *      @EnableDiscoveryClient eureka服务发现
 * </p>
 */
@EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication
@MapperScan(basePackages = "com.springcloud.dao")
@EnableCircuitBreaker
public class ProvideHystrixApplication8080 {

    public static void main(String[] args) {
        SpringApplication.run(ProvideHystrixApplication8080.class, args);
    }
}
