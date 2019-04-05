package com.wzy.component.entity;

import java.io.Serializable;

public class Order implements IOrderStatus, Serializable {
    public long id;
    public String name;

    public Order() {
    }

    public Order(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
