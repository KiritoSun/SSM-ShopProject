package com.zt.pojo;

public class cart {
    private String cname;
    private String id;
    private String img;
    private String name;
    private int price;
    private int number;
    public cart(){}

    public cart(String cname, String id, String img, String name, int price, int number) {
        this.cname = cname;
        this.id = id;
        this.img = img;
        this.name = name;
        this.price = price;
        this.number = number;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "cart{" +
                "cname='" + cname + '\'' +
                ", id='" + id + '\'' +
                ", img='" + img + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", number=" + number +
                '}';
    }
}
