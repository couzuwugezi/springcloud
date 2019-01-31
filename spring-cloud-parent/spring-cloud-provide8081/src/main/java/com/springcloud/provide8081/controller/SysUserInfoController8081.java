package com.springcloud.provide8081.controller;

import com.springcloud.entity.SysUserInfo;
import com.springcloud.provide8081.service.SysUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户信息表(SysUserInfo)表控制层
 *
 * @author makejava
 * @since 2019-01-04 15:58:31
 */
@RestController
public class SysUserInfoController8081 {
    /**
     * 服务对象
     */
    @Resource
    private SysUserInfoService sysUserInfoService;

    @Autowired
    private DiscoveryClient client;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/user/get/{id}")
    public SysUserInfo selectOne(@PathVariable("id") Integer id) {
        return this.sysUserInfoService.queryById(id);
    }

    @GetMapping(value = "/user/list")
    public List<SysUserInfo> list() {
        return sysUserInfoService.queryAll(new SysUserInfo());
    }

    @PostMapping(value = "/user/add")
    public boolean add(SysUserInfo sysUserInfo) {
        return sysUserInfoService.insert(sysUserInfo);
    }

    @GetMapping(value = "/provide8080/discovery")
    public Object discovery() {
//        List<String> services = client.getServices();
//        List<String> collect = services.stream().filter("PROVIDE8080"::equals).collect(Collectors.toList());

        List<ServiceInstance> serverList = client.getInstances("PROVIDE8080");
        serverList.forEach(element -> System.out.println(element.getServiceId() + "\t"
                + element.getHost() + "\t" + element.getPort() + "\t" + element.getUri()));

        return this.client;
    }

    @GetMapping(value = "/check/jiqun")
    public String check() {
        return "我是8081";
    }
}