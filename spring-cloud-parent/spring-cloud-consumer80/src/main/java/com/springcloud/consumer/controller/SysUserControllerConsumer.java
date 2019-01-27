package com.springcloud.consumer.controller;

import com.springcloud.entity.SysUserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

/**
 * @author liqiang
 * @date 2019-01-04 15:26
 * @description 消费controller
 */
@RestController
public class SysUserControllerConsumer {

    private static final String REST_URL_PREFIX = "http://localhost:8080";

    /**
     * RestTemplate
     * 使用这个模板访问rest服务非常简单粗暴
     * url:访问的请求地址
     * request:请求类型
     * responseType:响应类型
     */
    @Autowired
    private RestTemplate restTemplate;

    @PostMapping(value = "/consumer/user/add")
    public boolean add(SysUserInfo sysUserInfo) {
        return Optional.ofNullable(restTemplate.postForObject(REST_URL_PREFIX + "/user/add", sysUserInfo, Boolean.class)).orElse(false);
    }

    @GetMapping(value = "/consumer/user/get/{id}")
    public SysUserInfo get(@PathVariable("id") Integer id) {
        return Optional.ofNullable(restTemplate.getForObject(REST_URL_PREFIX + "/user/get" + id, SysUserInfo.class)).orElse(null);
    }

    @GetMapping(value = "consumer/user/list")
    public List list() {
        return restTemplate.getForObject(REST_URL_PREFIX + "/user/list", List.class);
    }

    @GetMapping(value = "consumer/discovery")
    public Object discovery() {
        return restTemplate.getForObject(REST_URL_PREFIX + "/provide8080/discovery", Object.class);
    }

    @GetMapping(value = "consumer/check")
    public String check() {
        return restTemplate.getForObject(REST_URL_PREFIX + "/check/jiqun", String.class);
    }
}
