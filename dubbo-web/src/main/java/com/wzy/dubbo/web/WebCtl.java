package com.wzy.dubbo.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.wzy.component.entity.User;
import com.wzy.component.server.IOrderServer;
import com.wzy.component.server.IUserServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebCtl {
    @Reference
    private IOrderServer orderServer;
    @Reference
    private IUserServer userServer;

    @RequestMapping("getUser")
    public User getUser() {
        System.out.println("WebCtl getUser...");
        System.out.println(orderServer.getName());
        return userServer.getById(100);
    }
}
