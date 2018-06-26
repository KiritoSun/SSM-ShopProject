package com.zt.pojo;

public class order {
    private String rid;
    private String cname;
    private String ids;
    private String names;
    private int price;
    public order(){}

    public order(String rid, String cname, String ids, String names, int price) {
        this.rid = rid;
        this.cname = cname;
        this.ids = ids;
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

    public String getIds() {
        return ids;
    }

    public void setIds(String ids) {
        this.ids = ids;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
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
        return "order{" +
                "rid='" + rid + '\'' +
                ", cname='" + cname + '\'' +
                ", ids='" + ids + '\'' +
                ", names='" + names + '\'' +
                ", price=" + price +
                '}';
    }
}
