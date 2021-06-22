package com.yumoxuan.dao;

import com.yumoxuan.domain.Order;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/*商家菜单类，一个代表一种食品*/
public interface OrderDao {
    /*添加商品*/
    public boolean insertOrder(Order order);
    /*获取某一商家全部商品*/
    public List<Order> queryOrder(int sid);
    /*搜索商家内部的菜品,param给后面第一个参数起一个名字，在映射文件中，该参数就对应该名字*/
    public List<Order> queryOrderByStoreName(@Param("sid") int sid, @Param("name") String name);
    /*删除商品*/
    public boolean deleteOrder(int sid);
    /*更新商品信息*/
    public boolean updateOrder(Order order);
}
