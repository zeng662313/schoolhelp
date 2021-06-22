package com.yumoxuan.domain;

import java.math.BigDecimal;

public class Order {
    private int id;
    /*商家的id作为该菜的所属商家*/
    private int sid;
    private String name;
    private String picture;
    private String detail;
    private int price;
    private int saleNum=0;

    public void setId(int id) {
        this.id = id;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setSaleNum(int saleNum) {
        this.saleNum = saleNum;
    }

    public int getId() {
        return id;
    }

    public int getSid() {
        return sid;
    }

    public String getName() {
        return name;
    }

    public String getPicture() {
        return picture;
    }

    public String getDetail() {
        return detail;
    }

    public int getPrice() {
        return price;
    }

    public int getSaleNum() {
        return saleNum;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", sid=" + sid +
                ", name='" + name + '\'' +
                ", picture='" + picture + '\'' +
                ", detail='" + detail + '\'' +
                ", price=" + price +
                ", saleNum=" + saleNum +
                '}';
    }
}
