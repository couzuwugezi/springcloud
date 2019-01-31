package com.springcloud.common.service;

import com.springcloud.entity.SysUserInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * 用户信息表(SysUserInfo)表服务接口
 *
 * @author makejava
 * @since 2019-01-04 15:47:33
 */
@FeignClient(value = "PROVIDE")
public interface SysUserInfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @GetMapping("/user/get/{id}")
    SysUserInfo queryById(@PathVariable("id") Integer id);

    /**
     * 新增数据
     *
     * @param sysUserInfo 实例对象
     * @return 实例对象
     */
    @PostMapping(value = "/user/add")
    boolean insert(SysUserInfo sysUserInfo);

    /**
     * 根据给定字段查询数据
     *
     * @return 实例对象
     */
    @GetMapping(value = "/user/list")
    List<SysUserInfo> queryAll();

    /**
     * 测试负载均衡
     * @return
     */
    @GetMapping(value = "/check/jiqun")
    String check();
}