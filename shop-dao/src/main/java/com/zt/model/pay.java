package com.zt.model;

public class pay {
    private String id;
    private String img;
    private String name;
    private int number;
    private int price;
    public pay(){}

    public pay(String id, String img, String name, int number, int price) {
        this.id = id;
        this.img = img;
        this.name = name;
        this.number = number;
        this.price = price;
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

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "pay{" +
                "id='" + id + '\'' +
                ", img='" + img + '\'' +
                ", name='" + name + '\'' +
                ", number=" + number +
                ", price=" + price +
                '}';
    }
}
