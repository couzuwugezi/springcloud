package com.springcloud.api.controller;

import com.springcloud.dao.SysUserInfoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author liqiang
 * 时间 2018-12-05 15:02
 * 描述 index
 */
@Controller
public class IndexController {

    @Autowired
    private SysUserInfoDao sysUserInfoDao;

    @GetMapping(value = {"/", "/login*"})
    public String index(ModelMap map){
        map.put("user",sysUserInfoDao.queryById(22));
        return "index";
    }
}
