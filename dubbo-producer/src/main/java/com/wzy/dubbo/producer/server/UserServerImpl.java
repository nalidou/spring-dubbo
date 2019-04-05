package com.wzy.dubbo.producer.server;

import com.alibaba.dubbo.config.annotation.Service;
import com.wzy.component.entity.User;
import com.wzy.component.server.IUserServer;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Service(interfaceClass = IUserServer.class)
@Component
public class UserServerImpl implements IUserServer {
    @Override
    public User getById(long id) {
        return new User(id, "小明");
    }

    @Override
    public List<User> getAll() {
        List<User> list = new ArrayList<User>();
        list.add(new User(100, "jerry"));
        list.add(new User(200, "tom"));
        return list;
    }
}
