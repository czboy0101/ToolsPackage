package com.wlq.modules.sys.controller;


import com.wlq.modules.sys.mapper.SysUserMapper;
import com.wlq.modules.sys.model.SysUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {

    @Resource
    private SysUserMapper sysUserMapper;

    @GetMapping("/t")
    public String t() {
        System.out.println("--t--");
        List<SysUser> l = sysUserMapper.selectList(null);
        System.out.println("--u--"+l.toString());
        return "test page";
    }

}
