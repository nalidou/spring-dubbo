package com.wzy.component.server;

import com.wzy.component.entity.User;

import java.util.List;

public interface IUserServer {
    public User getById(long id);
    public List<User> getAll();
}
