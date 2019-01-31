package com.springcloud.hystrix.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.springcloud.entity.SysUserInfo;
import com.springcloud.hystrix.service.SysUserInfoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Optional;

/**
 * 用户信息表(SysUserInfo)表控制层
 *
 * @author makejava
 * @since 2019-01-04 15:58:31
 */
@RestController
public class SysUserInfoController8080 {
    /**
     * 服务对象
     */
    @Resource
    private SysUserInfoService sysUserInfoService;

    /**
     * 一旦调用服务方法失败并抛出了错误信息后,
     * 会自动调用@HystrixCommand标注好的
     * fallbackMethod调用类中的指定方法
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/user/get/{id}")
    @HystrixCommand(fallbackMethod = "sendErrorMsg")
    public SysUserInfo selectOne(@PathVariable("id") Integer id) {
        return Optional.ofNullable(this.sysUserInfoService.queryById(id))
                .orElseThrow(() -> new RuntimeException("该Id" + id + "没有对应的信息"));
    }

    public SysUserInfo sendErrorMsg(Integer id) {
        return new SysUserInfo().setId(id).setRealName("该Id" + id + "没有对应的信息,此处熔断");
    }
}