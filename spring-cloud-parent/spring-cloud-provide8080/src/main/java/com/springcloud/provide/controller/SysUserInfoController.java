package com.springcloud.provide.controller;

import com.springcloud.entity.SysUserInfo;
import com.springcloud.provide.service.SysUserInfoService;
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
public class SysUserInfoController {
    /**
     * 服务对象
     */
    @Resource
    private SysUserInfoService sysUserInfoService;

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
    public List<SysUserInfo> list(){
        return sysUserInfoService.queryAll(new SysUserInfo());
    }

    @PostMapping(value = "/user/add")
    public boolean add(SysUserInfo sysUserInfo){
        return sysUserInfoService.insert(sysUserInfo);
    }

}