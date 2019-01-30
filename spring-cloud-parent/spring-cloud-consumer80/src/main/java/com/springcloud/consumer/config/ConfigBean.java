package com.springcloud.consumer.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author liqiang
 * @date 2019-01-04 15:08
 * @description boot配置
 */
@Configuration
public class ConfigBean {

    /**
     * <p>
     *     @LoadBalanced 客户端负载均衡
     *     spring cloud ribbon 是一套客户端的负载均衡工具
     * </p>
     * @return
     */
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
