package com.yumoxuan.service.impl;

import com.yumoxuan.dao.OrderDao;
import com.yumoxuan.domain.Order;
import com.yumoxuan.service.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Resource
    OrderDao orderDao;

    @Override
    public boolean insertOrder(Order order) {
        return orderDao.insertOrder(order);
    }

    @Override
    public List<Order> queryOrder(int sid) {
        return orderDao.queryOrder(sid);
    }

    @Override
    public List<Order> queryOrderByStoreName(int sid, String name) {
        return orderDao.queryOrderByStoreName(sid, name);
    }

    @Override
    public boolean deleteOrder(int sid) {
        return orderDao.deleteOrder(sid);
    }

    @Override
    public boolean updateOrder(Order order) {
        return orderDao.updateOrder(order);
    }
}
