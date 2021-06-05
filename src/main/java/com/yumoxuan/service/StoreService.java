package com.yumoxuan.service;

import com.yumoxuan.domain.Store;


import java.util.List;

public interface StoreService {
    public boolean addStore(Store store);
    public List<Store> queryStores();
    public boolean deleteStore(int id);
    public boolean updateStore(Store store);
    public boolean exitsStore(String name);
}
