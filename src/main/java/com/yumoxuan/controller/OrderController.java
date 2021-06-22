package com.yumoxuan.controller;

import com.yumoxuan.domain.Order;
import com.yumoxuan.service.OrderService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/order")
public class OrderController {
    @Resource
    OrderService orderService;
    /*添加商品*/
    @ResponseBody
    @RequestMapping("/insertOrder.do")
    public boolean insertOrder(Order order){
        return orderService.insertOrder(order);
    }
    /*获取某一商家全部商品*/
    @ResponseBody
    @RequestMapping("/queryOrder.do")
    public List<Order> queryOrder(int sid){
        return orderService.queryOrder(sid);
    }
    /*搜索商家内部的菜品*/
    @ResponseBody
    @RequestMapping("/queryOrderByStoreName.do")
    public List<Order> queryOrderByStoreName(int sid, String name){
        return orderService.queryOrderByStoreName(sid,name);
    }
    /*删除商品*/
    @ResponseBody
    @RequestMapping("/deleteOrder.do")
    public boolean deleteOrder(int sid){
        return orderService.deleteOrder(sid);
    }
    /*更新商品信息*/
    @ResponseBody
    @RequestMapping("/updateOrder.do")
    public boolean updateOrder(Order order){
        return orderService.updateOrder(order);
    }
}
