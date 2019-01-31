package com.springcloud;

import com.ribbon.MyLoaderBalancer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author liqiang
 * <p>
 * @EnableEurekaClient 消费者也作为一个Eureka客户端
 * @RibbonClient Ribbon自定义一个负载算法类,在微服务启动的时候自动加载
 * </p>
 */
@EnableEurekaClient
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@RibbonClient(name = "PROVIDE", configuration = MyLoaderBalancer.class)
public class ConsumerRibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerRibbonApplication.class, args);
    }

}

