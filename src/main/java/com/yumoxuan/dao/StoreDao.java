package com.yumoxuan.dao;

import com.yumoxuan.domain.Store;

import java.util.List;

public interface StoreDao {
    /*注册商家*/
    public boolean insertStore(Store store);
    /*查询商家*/
    public List<Store> queryStores();
    /*注销商家*/
    public boolean deleteStore(int id);
    /*修改商家信息*/
    public boolean updateStore(Store store);
    /*用来查看某个名字的商店是否存在*/
    public List<Store> exitsStore(String name);
}
