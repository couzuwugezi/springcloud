package com.springcloud.consumer.controller;

import com.springcloud.common.service.SysUserInfoService;
import com.springcloud.entity.SysUserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author liqiang
 * @date 2019-01-04 15:26
 * @description 消费controller
 */
@RestController
public class SysUserControllerConsumer {

    @Autowired
    private SysUserInfoService sysUserInfoService;

    @GetMapping(value = "/consumer/user/get/{id}")
    public SysUserInfo selectOne(@PathVariable("id") Integer id) {
        return sysUserInfoService.queryById(id);
    }

    @GetMapping(value = "consumer/user/list")
    public List<SysUserInfo> list() {
        return sysUserInfoService.queryAll();
    }

    @PostMapping(value = "/consumer/user/add")
    public boolean add(SysUserInfo sysUserInfo) {
        return sysUserInfoService.insert(sysUserInfo);
    }

    @GetMapping(value = "consumer/check")
    public String check() {
        return sysUserInfoService.check();
    }
}
