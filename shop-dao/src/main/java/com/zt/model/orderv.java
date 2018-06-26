package com.zt.model;

import java.util.List;

public class orderv {
    private String rid;
    private String cname;
    private List<String> names;
    private int price;
    public orderv(){}

    public orderv(String rid, String cname, List<String> names, int price) {
        this.rid = rid;
        this.cname = cname;
        this.names = names;
        this.price = price;
    }

    public String getRid() {
        return rid;
    }

    public void setRid(String rid) {
        this.rid = rid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "orderv{" +
                "rid='" + rid + '\'' +
                ", cname='" + cname + '\'' +
                ", names=" + names +
                ", price=" + price +
                '}';
    }
}
