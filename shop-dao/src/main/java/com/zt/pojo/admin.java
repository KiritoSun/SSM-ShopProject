package com.zt.pojo;

public class admin {
    private String cname;
    private String password;
    private String name;
    private String phone;
    public admin(){}

    public admin(String cname, String password, String name, String phone) {
        this.cname = cname;
        this.password = password;
        this.name = name;
        this.phone = phone;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "admin{" +
                "cname='" + cname + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
