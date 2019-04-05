package com.wzy.dubbo.producer.server;

import com.alibaba.dubbo.config.annotation.Service;
import com.wzy.component.server.IOrderServer;
import org.springframework.stereotype.Component;

@Service(interfaceClass = IOrderServer.class)
@Component
public class OrderServerImpl implements IOrderServer {
    @Override
    public String getName() {
        System.out.println("get name...");
        return "订单名字";
    }
}
