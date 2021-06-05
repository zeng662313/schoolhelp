package com.yumoxuan.service.impl;

import com.yumoxuan.dao.StoreDao;
import com.yumoxuan.domain.Store;
import com.yumoxuan.service.StoreService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class StoreServiceImpl implements StoreService {
    @Resource
    private StoreDao storeDao;
    @Override
    public boolean addStore(Store store) {
        boolean key=storeDao.insertStore(store);
        return key;
    }

    @Override
    public List<Store> queryStores() {
        return storeDao.queryStores();
    }

    @Override
    public boolean deleteStore(int id) {
        boolean key=storeDao.deleteStore(id);
        return key;
    }

    @Override
    public boolean updateStore(Store store) {
        return storeDao.updateStore(store);
    }

    @Override
    public boolean exitsStore(String name) {
        List list =storeDao.exitsStore(name);
        if(list.isEmpty()){
            return false;
        }else{
            return true;
        }
    }

}
