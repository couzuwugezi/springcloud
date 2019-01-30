package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author liqiang
 */
@EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication
@MapperScan(basePackages = "com.springcloud.dao")
public class ProvideApplication8082 {

    public static void main(String[] args) {
        SpringApplication.run(ProvideApplication8082.class, args);
    }
}
