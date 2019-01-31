package com.ribbon;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author liqiang
 * @date 2019-01-30 13:17
 * @description 自定义负载均衡规则
 */
@Configuration
public class MyLoaderBalancer{

    @Bean
    public IRule myRule(){
        return new MySelfRule();
    }
}
