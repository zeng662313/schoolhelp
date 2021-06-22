package com.yumoxuan.service;

import com.yumoxuan.domain.Order;

import java.util.List;

public interface OrderService {
    public boolean insertOrder(Order order);
    public List<Order> queryOrder(int sid);
    public List<Order> queryOrderByStoreName(int sid,String name);
    public boolean deleteOrder(int sid);
    public boolean updateOrder(Order order);
}
