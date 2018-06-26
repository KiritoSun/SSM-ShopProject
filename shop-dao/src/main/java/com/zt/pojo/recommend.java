package com.zt.pojo;

public class recommend {
    private String id;
    private String img;
    private String title;
    private String info;
    private int weight;
    public recommend(){}

    public recommend(String id, String img, String title, String info, int weight) {
        this.id = id;
        this.img = img;
        this.title = title;
        this.info = info;
        this.weight = weight;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "recommend{" +
                "id='" + id + '\'' +
                ", img='" + img + '\'' +
                ", title='" + title + '\'' +
                ", info='" + info + '\'' +
                ", weight=" + weight +
                '}';
    }
}
