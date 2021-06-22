package com.yumoxuan.controller;

import com.yumoxuan.domain.Store;
import com.yumoxuan.service.StoreService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("/store")
public class StoreController {
    @Resource
    private StoreService storeService;

    /*注册商家*/
    @ResponseBody
    @RequestMapping(value = "/insertStore.do", method = RequestMethod.POST)
    public HashMap<String, String> addStore(Store store) {
        boolean sym = storeService.exitsStore(store.getName());//查看该商家名字是否已经存在
        boolean key = false;//是否更新成功
        HashMap<String, String> map = new HashMap<>();
        if (!sym) {
            key = storeService.addStore(store);
            if (key) {
                map.put("res", "注册成功！");
            } else {
                map.put("res", "注册失败，请重试！");
            }
        }else{
            map.put("res","注册失败，该商家名已经被注册！");
        }
        return map;
    }

    /*查询商家*/
    @ResponseBody
    @RequestMapping("/queryStores.do")
    public List<Store> queryStores() {
        List<Store> list = storeService.queryStores();
        return list;
    }

    /*注销商家*/
    @ResponseBody
    @RequestMapping("/deleteStore.do")
    public HashMap<String, String> deleteStore(int id) {
        boolean key = storeService.deleteStore(id);
        HashMap<String, String> map = new HashMap<>();
        if (key) {
            map.put("res", "注销成功！");
        } else {
            map.put("res", "注销失败！");
        }
        return map;
    }

    /*更新商家信息*/
    @ResponseBody
    @RequestMapping("/updateStore.do")
    public HashMap<String, String> updateStore(Store store) {
        boolean sym = storeService.exitsStore(store.getName());//查看该商家名字是否已经存在
        boolean key = false;//是否更新成功
        HashMap<String, String> map = new HashMap<>();
        if (!sym) {
            key = storeService.updateStore(store);
            if (key) {
                map.put("res", "更新成功！");
            } else {
                map.put("res", "更新失败！");
            }
        } else {
            map.put("res", "该商家名已经被注册！");
        }
        return map;
    }
}
