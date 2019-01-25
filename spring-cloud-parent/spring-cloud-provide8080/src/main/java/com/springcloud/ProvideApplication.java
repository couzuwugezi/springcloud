package com.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author liqiang
 * <p>
 *      @EnableEurekaClient 说明这个是Eureka服务提供者
 * </p>
 */
@EnableEurekaClient
@SpringBootApplication
@MapperScan(basePackages = "com.springcloud.dao")
public class ProvideApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProvideApplication.class, args);
    }
}
