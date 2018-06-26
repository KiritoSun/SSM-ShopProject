package com.zt.pojo;

public class sort {
    private String id;
    private String img;
    private String title;
    private String info;
    public sort(){}

    public sort(String id, String img, String title, String info) {
        this.id = id;
        this.img = img;
        this.title = title;
        this.info = info;
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

    @Override
    public String toString() {
        return "sort{" +
                "id='" + id + '\'' +
                ", img='" + img + '\'' +
                ", title='" + title + '\'' +
                ", info='" + info + '\'' +
                '}';
    }
}
