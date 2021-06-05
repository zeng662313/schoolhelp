package com.yumoxuan.domain;
/*商家信息*/
public class Store {
    private int id;
    private String name;
    private String detail;
    private String picture;
    private String phone;
    private String time;
    private String adress;

    public Store() {
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDetail() {
        return detail;
    }

    public String getPicture() {
        return picture;
    }

    public String getPhone() {
        return phone;
    }

    public String getTime() {
        return time;
    }

    public String getAdress() {
        return adress;
    }

    @Override
    public String toString() {
        return "Store{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", detail='" + detail + '\'' +
                ", picture='" + picture + '\'' +
                ", phone='" + phone + '\'' +
                ", time='" + time + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }
}
